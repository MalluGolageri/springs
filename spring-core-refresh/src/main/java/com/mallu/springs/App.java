package com.mallu.springs;

import com.mallu.springs.beans.Department;
import com.mallu.springs.beans.Employee;
import com.mallu.springs.beans.EmployeeConfig;
import com.mallu.springs.beans.MyApplicationContextAware;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
class App
{

    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Employee emp=(Employee)context.getBean("employee");
        System.out.println(emp);

        System.out.println("==JavaConfig==");
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        System.out.println(applicationContext.getBean("employeeConfig"));

        System.out.println(MyApplicationContextAware.getContext().getBean("employee"));




    }
    private void getEmployeeInfo(){
        //System.out.println(employee);
    }
}



