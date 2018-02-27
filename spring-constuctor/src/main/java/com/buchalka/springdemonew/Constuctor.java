package com.buchalka.springdemonew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Organisation org= (Organisation) ctx.getBean("myorg");
		org.Coprateslogon();
		System.out.println(org);
		
		((ClassPathXmlApplicationContext)ctx).close();
		
		
		
	}

}
