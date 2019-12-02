package com.processor.util;

import com.processor.PricingCalculator;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class CalculatorFactory {

	public static ICalculator create() {
		MethodInterceptor handler = new InvocationHandlerImpl(new PricingCalculator());
		PricingCalculator calculator = (PricingCalculator) Enhancer.create(PricingCalculator.class, handler);
		return calculator;
	}

}
