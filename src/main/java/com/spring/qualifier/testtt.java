package com.spring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testtt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/qualifier/Config.xml");
	student student1= (student)context.getBean("student1" );
	System.out.println(student1);

	}

}
