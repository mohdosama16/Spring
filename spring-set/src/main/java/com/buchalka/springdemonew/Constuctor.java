package com.buchalka.springdemonew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.buchalka.spring.domain.Organisation;

public class Constuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Organisation org= (Organisation) ctx.getBean("myorg");
		org.Coprateslogon();
		System.out.println(org);
		//System.out.println(org.c);
		((ClassPathXmlApplicationContext)ctx).close();
		
		
		
	}

}
