package com.smart.springbootdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by dafei.wang on 22/08/2017.
 */
@Component
@ConfigurationProperties
public class GlobalProperties
{
    private int threadPool;
    private String email;

    public int getThreadPool()
    {
        return threadPool;
    }

    public void setThreadPool(int threadPool)
    {
        this.threadPool = threadPool;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
