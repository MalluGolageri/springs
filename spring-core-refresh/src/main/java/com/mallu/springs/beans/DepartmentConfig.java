package com.mallu.springs.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by golagem on 7/3/17.
 */

@Configuration
public class DepartmentConfig {

    private String deptName;

    @Override
    public String toString() {

        return "department "+getDeptName();
    }

    public String getDeptName() {
        return deptName;
    }

    @Value(value = "SmartCard")
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
