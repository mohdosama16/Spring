package com.buchalka.spring.domain;

import com.buchalka.spring.servie.BService;

public class Organisation {
	private String companyname;
	private int year;
	private String emply;
	private int ecount;
	private String Slogon;
	private BService bs;
	
	
	public Organisation(){}	
	public Organisation(String companyname, int year) {
		this.companyname = companyname;
		this.year = year;
	}

	public String Coprateslogon(){
					return(Slogon);
			
	}

	public void setEmply(String emply) {
		this.emply = emply;
	}
	public void setEcount(int ecount) {
		this.ecount = ecount;
	}
	public void setSlogon(String slogon) {
		Slogon = slogon;
	}
	public void setBs(BService bs) {
		this.bs = bs;
	}
	
	@Override
	public String toString() {
		return "Organisation [companyname=" + companyname + ", year=" + year + ", emply=" + emply + ", ecount=" + ecount
				+ "]";
	}

}
