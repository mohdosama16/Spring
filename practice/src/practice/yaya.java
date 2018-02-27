package practice;

import java.util.Scanner;

public class yaya {
	
	public static void main (String[] arg){
	
		
		System.out.println("version java"+ System.getProperty("java.version"));
		System.out.println(System.getProperty("java.runTime.version"));
		
		Scanner d = new Scanner(System.in);
		System.out.println("whts ur name" );
		String f = d.nextLine();
		System.out.println("your name is " + f);
	 
	}}
