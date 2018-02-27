package com.buchalka.springdemonew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Ioc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		Organisation org= (Organisation) ctx.getBean("myorg");
		org.Coprateslogon();
		
		((FileSystemXmlApplicationContext)ctx).close();
		
		
		
	}

}
