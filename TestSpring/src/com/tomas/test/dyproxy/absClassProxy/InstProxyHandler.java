package com.tomas.test.dyproxy.absClassProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class InstProxyHandler implements MethodInterceptor{
	
	private Object proxied;

	public Object getInstance(Object proxied){
		this.proxied=proxied;
		Enhancer enhancer = new Enhancer();
		// 设置其代理的超类
		enhancer.setSuperclass(this.proxied.getClass());
		// 设置其回调对象
		enhancer.setCallback(this);
		// 最关键的一句与jdk模式的.newStance()作用相同
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object proxyObj, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		// 可以在invoke之前做一些事情
		System.out.println("--------InstProxyHandler.intercept()--------");
		
		Object obj = methodProxy.invoke(proxied, args);
		
		// 可以在invoke之后做一些事情
		System.out.println("--------proxyHandler.finished--------");
		return obj;
	}
	
}
