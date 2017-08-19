package com.mallu.springs.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * Created by golagem on 7/3/17.
 */
@Configuration
public class MyApplicationContextAware implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public static ApplicationContext getContext(){
        return applicationContext;
    }

}
