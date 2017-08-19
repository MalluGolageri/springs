package com.mallu.springs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by golagem on 7/3/17.
 */

@Component
public class Employee {

    private String name;

    private String id;

    private Department department;

    @Autowired
    private EmployeeConfig employeeConfig;

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

    @Value(value = "RaviId")
    public void setId(String id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return employeeConfig.getName() + " belongs to "+getDepartment();
    }
}
