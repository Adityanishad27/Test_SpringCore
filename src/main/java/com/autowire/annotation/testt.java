package com.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context= new ClassPathXmlApplicationContext("com/autowire/annotation/config.xml");
	person person1= (person)context.getBean("person1");
	System.out.println(person1);

	}

}
