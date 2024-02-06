package com.Reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		System.out.println("programme Started...........");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/Reference/Config.xml");
  Student  Student1= (Student) context.getBean("Student1");
  System.out.println(Student1);
  ((ClassPathXmlApplicationContext) context).close();
	}

}
