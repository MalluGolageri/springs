package com.mallu.springs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Created by golagem on 7/3/17.
 */

@Configuration
public class EmployeeConfig {

    private String name;

    private String id;

    public String getName() {
        return name;
    }

    @Value(value = "Ravi")
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getName() + " belongs to "+getDepartmentConfig();
    }

    @Bean
    public DepartmentConfig getDepartmentConfig() {
        return new DepartmentConfig();
    }

}
