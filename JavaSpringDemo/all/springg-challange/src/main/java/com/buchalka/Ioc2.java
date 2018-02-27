package com.buchalka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ioc2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext c= new ClassPathXmlApplicationContext("bean-challenge.xml");
     City nc = (City) c.getBean("mycity");
     nc.cityname();
     
     
     ((ClassPathXmlApplicationContext)c).close();		 
		 
		 
		 
	}

}
