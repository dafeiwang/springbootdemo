package com.smart.springbootdemo.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * Created by dafei on 9/5/2017.
 */
public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car() {
        System.out.println("调用Car()构造函数。");
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性。");
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactoryAware.setBeanFactory()。");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("调用BeanNameAware.setBeanName()。");
        this.beanName = beanName;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destory()。");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet()。");
    }

    public void myInit() {
        System.out.println("调用init-method所指定的myInit()，将maxSpeed设置为240。");
        this.maxSpeed = 240;
    }

    public void myDestroy() {
        System.out.println("调用destroy-method所指定的myDestroy()。");
    }

    public void introduce() {
        System.out.println("brand: " + brand + ";color:" + ";maxSpeed:" + maxSpeed);
    }
}
