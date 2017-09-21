package com.tomas.test.partialTest.dyproxy.interfaceProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理的处理类
 */
public class SubjectProxyHandler implements InvocationHandler {
	
	/**
	 * 被代理的真实对象存放处
	 */
	private Object proxied;
	
	public SubjectProxyHandler(Object proxied) {
		this.proxied = proxied;
	}
	
	// 我们只需要关注对于真是对象的方法调用环节
	@Override
	public Object invoke(Object proxyObj, Method method, Object[] args)
			throws Throwable {
		// 在之前可以做的事情
		System.out.println("SubjectProxyHandler.invoke()--before");
		// 注意此处调用的是proxied(属性)而不是proxyObj(变量)
		Object obj = method.invoke(proxied, args);
		
		System.out.println("SubjectProxyHandler.invoke()--after");
		//在之后可以做的事情
		return obj;
	}
}
