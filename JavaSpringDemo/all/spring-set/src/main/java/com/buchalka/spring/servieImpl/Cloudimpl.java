package com.buchalka.spring.servieImpl;

import java.util.Random;

import com.buchalka.spring.servie.BService;

public class Cloudimpl implements BService {

	public String offerservice(String companyname) {
		Random r = new Random();
		String Service ="/n an org,"+companyname +" gv world class cloud servie with anual income"+r.nextInt(revenue);
		return Service;
	}

}
