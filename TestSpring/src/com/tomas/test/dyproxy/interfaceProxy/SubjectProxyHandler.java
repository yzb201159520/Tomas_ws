package com.tomas.test.dyproxy.interfaceProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理的真实处理类
 * @author thomas
 *
 */
public class SubjectProxyHandler implements InvocationHandler {
	
	/**
	 * 被代理的真实对象存放处
	 */
	private Object proxied;
	
	public SubjectProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

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
