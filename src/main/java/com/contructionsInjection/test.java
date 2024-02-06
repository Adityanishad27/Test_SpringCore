package com.contructionsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/contructionsInjection/Config.xml");
		person person1=(person)context.getBean("person1");
		System.out.println(person1);
		((ClassPathXmlApplicationContext) context).close();
		
	}

}
