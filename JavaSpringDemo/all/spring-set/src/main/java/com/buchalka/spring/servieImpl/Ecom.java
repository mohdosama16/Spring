package com.buchalka.spring.servieImpl;

import java.util.Random;

import com.buchalka.spring.servie.BService;

public class Ecom implements BService {

	public String offerservice(String companyname) {
		
			Random r = new Random();
			String Service ="/n an org,"+companyname +" gv world class ecom servie with anual income"+r.nextInt(revenue);
			return Service;
		}
	}


