package com.usamaSpring.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
    	
    	//Vehicle d= (Vehicle)ctx.getBean("car");
    	//d.drive();
    	//Tyre t = (Tyre) ctx.getBean("Tyre");
    	//System.out.println(t);
    
    Car d=(Car)ctx.getBean("car");
    
    d.drive();
    	
    }
    
}
