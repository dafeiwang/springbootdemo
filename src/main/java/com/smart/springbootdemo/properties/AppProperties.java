package com.smart.springbootdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dafei.wang on 22/08/2017.
 */


@Component
@ConfigurationProperties("app")
public class AppProperties
{
    private String error;
    private List<Menu> menus = new ArrayList<>();
    private Compiler compiler = new Compiler();

    public static class Menu {
        private String name;
        private String path;
        private String title;

        //getters and setters

        @Override
        public String toString() {
            return "Menu{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", title='" + title + '\'' +
                '}';
        }
    }

    public static class Compiler
    {
        private String timeout;
        private String outputFolder;

        //getters and setters

        @Override
        public String toString()
        {
            return "Compiler{" +
                "timeout='" + timeout + '\'' +
                ", outputFolder='" + outputFolder + '\'' +
                '}';
        }
    }
}
