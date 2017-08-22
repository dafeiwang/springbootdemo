package com.smart.springbootdemo.controller;

import com.smart.springbootdemo.properties.AppProperties;
import com.smart.springbootdemo.properties.GlobalProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by dafei.wang on 22/08/2017.
 */
@RestController
public class WelcomeController
{
    @Autowired
    private AppProperties app;

    @Autowired
    private GlobalProperties global;

    @RequestMapping("/")
    public String welcome() {
        String globalProperties = global.toString();
        String appProperties = app.toString();
        return globalProperties + " " + appProperties;
    }
}
