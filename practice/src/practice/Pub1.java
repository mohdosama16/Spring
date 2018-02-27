package practice;


import java.util.*;

public class Pub1 {
	private Scanner x;
	
	public void openFile(){
		
	try {
		x = new Scanner("C:\\Users\\DR\\Desktop\\Cvzzzz\\hindi.text");
	} catch (Exception e) {
		System.out.println("error");
	}
	
	}
	
	public void readfile(){
	while (x.hasNext()){
		String a =x.next();
		
		System.out.printf("%s",a);   
	}
	}
		
	
	
}
