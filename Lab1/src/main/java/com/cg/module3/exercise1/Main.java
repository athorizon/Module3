package com.cg.module3.exercise1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
		Employee emp=(Employee) context.getBean("employee1.1");
		
		System.out.println("Employee");
		System.out.println("------------------------");
		System.out.println("Employee Id:	"+emp.getEmployeeId());
		System.out.println("Employee Name:	"+emp.getEmployeeName());
		System.out.println("Employee Salary:"+emp.getSalary());
		System.out.println("Employee BU:	"+emp.getBusinessUnit());
		System.out.println("Employee Age:	"+emp.getAge());
	}

}
