package com.springboot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "programme Straterd..............");
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
      student student1= (student)context.getBean("student1");
      System.out.println(student1);
      ((ClassPathXmlApplicationContext) context).close();
        
        
    }
}
