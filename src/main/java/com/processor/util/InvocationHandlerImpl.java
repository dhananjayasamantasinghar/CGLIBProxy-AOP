package com.processor.util;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class InvocationHandlerImpl implements MethodInterceptor {

	private final Object original;

	public InvocationHandlerImpl(Object original) {
		this.original = original;
	}

	@Override
	public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		beforAdvice();
		Object res = method.invoke(original, args);
		afterAdvice();

		return res;
	}
	
	public void beforAdvice() {
		System.out.println("Check in Cache");
	}

	public void afterAdvice() {
		System.out.println("Put in cache");
	}
}
