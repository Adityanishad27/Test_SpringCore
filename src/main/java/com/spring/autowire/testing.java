package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/Config.xml");
		Employee Employee1 = context.getBean("Employee1",Employee.class);
		System.out.println(Employee1);

	}

}
