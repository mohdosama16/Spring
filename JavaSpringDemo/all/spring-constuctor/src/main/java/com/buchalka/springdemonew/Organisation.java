package com.buchalka.springdemonew;

public class Organisation {
	private String companyname;
	private int year;
	
	public Organisation(){}	
	public Organisation(String companyname, int year) {
		this.companyname = companyname;
		this.year = year;
	}

	public void Coprateslogon(){
			
		String Slogon = "we build ultimate cars";
		System.out.println(Slogon);
			
	}

	@Override
	public String toString() {
		return "Organisation [companyname=" + companyname + ", year=" + year + "]";
	}

}
