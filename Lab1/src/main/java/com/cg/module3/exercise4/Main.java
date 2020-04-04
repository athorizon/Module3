package com.cg.module3.exercise4;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
		Employee emp1=(Employee) context.getBean("employee100");
		Employee emp2=(Employee) context.getBean("employee101");
		
		
		Map<Integer,Employee> empList=new HashMap<Integer,Employee>();
		empList.put(emp1.getEmployeeId(),emp1);
		empList.put(emp2.getEmployeeId(),emp2);
		
		System.out.println("enter employee id");
		Integer empId=new Scanner(System.in).nextInt();
		
		System.out.println(empList.get(empId));
	}

}
