package com.mallu.springs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by golagem on 7/3/17.
 */
@Component
public class Department {

    private String deptName;

    @Autowired
    private DepartmentConfig departmentConfig;

    @Override
    public String toString() {

        return "department "+getDeptName() + " config:"+departmentConfig.getDeptName();
    }

    public String getDeptName() {
        return deptName;
    }

    @Value(value = "SmartCard")
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
