package com.processor.util;

import com.processor.PricingRequest;
import com.processor.PricingResponse;

public interface ICalculator {
	
	PricingResponse calculate(PricingRequest request);
}
