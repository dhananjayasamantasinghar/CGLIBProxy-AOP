package com.processor;

import java.math.BigDecimal;
import java.util.Date;

import com.processor.util.ICalculator;

public class PricingCalculator implements ICalculator {

	public PricingResponse calculate(PricingRequest request) {
		
		// call to pricing engine
		System.out.println("Calling 3rd party for calculation");
		PricingResponse resp = new PricingResponse();
		resp.setEndDate(new Date());
		resp.setEndDate(new Date());
		resp.setPremium(BigDecimal.valueOf(200.90));
		return resp;
	}


}
