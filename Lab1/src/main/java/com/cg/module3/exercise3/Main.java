package com.cg.module3.exercise3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.module3.exercise2.Employee;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
        SBU sbu=(SBU) context.getBean("sbu1.1");
        System.out.println(sbu.getSbuId());
        System.out.println(sbu.getSbuHead());
        System.out.println(sbu.getSbuName());
        System.out.println(sbu.getEmpList());
	}

}
