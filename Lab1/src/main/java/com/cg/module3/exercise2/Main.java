package com.cg.module3.exercise2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
        Employee emp=(Employee) context.getBean("employee1.2");
        System.out.println(emp);
	}

}
