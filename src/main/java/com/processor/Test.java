package com.processor;

import java.math.BigDecimal;

import com.processor.util.CalculatorFactory;
import com.processor.util.ICalculator;

public class Test {

	
	public static void main(String[] args) {
		
		PricingRequest request = new PricingRequest();
		request.setAge(18);
		request.setDuration(1);
		request.setSumInsured(BigDecimal.valueOf(20.90));
		
		ICalculator calculator = CalculatorFactory.create();
		PricingResponse response = calculator.calculate(request);
		
		System.out.println("Premium is "+response.getPremium());
	}
}
