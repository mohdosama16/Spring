package usama;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drwaingapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext c= new ClassPathXmlApplicationContext("beans.xml");
		triangle d=(triangle)c.getBean("area");
		Point a=(Point)c.getBean("zerop");
		d.area();
		a.add();

	}

}
 