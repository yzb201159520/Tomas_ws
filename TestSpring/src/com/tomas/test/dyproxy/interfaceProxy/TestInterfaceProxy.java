package com.tomas.test.dyproxy.interfaceProxy;

import java.lang.reflect.Proxy;

public class TestInterfaceProxy {
	
	public static void main(String[] args) {
		RealSubject subject = new RealSubject();
		
		Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class<?>[]{Subject.class}, new SubjectProxyHandler(subject));
		
		System.out.println("------------realSubject.doSomething------------");
		subject.doSomething();
		System.out.println("------------执行完成------------");
		System.out.println("");		
		System.out.println("------------proxySubject.doSomething------------");
		proxySubject.doSomething();
		System.out.println("------------执行完成------------");
		
		// 这个就证明了 动态代理也是可以重复代理的。
		Subject proxySubject2 = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class<?>[]{Subject.class}, new SubjectProxyHandler(proxySubject));
		System.out.println("");		
		System.out.println("------------proxySubject2.doSomething------------");
		proxySubject2.doSomething();
		System.out.println("------------执行完成------------");
	}
}
