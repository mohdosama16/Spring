package com.usama.in.spring_new1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Ioc1 {

	public static void main(String[] args) {

		ApplicationContext c = new FileSystemXmlApplicationContext("bean.xml");
		
		Organisation d = (Organisation) c.getBean("myorg");
		
		d.Corpslogon();
		
		((FileSystemXmlApplicationContext)c).close();
		
		

	}

}
