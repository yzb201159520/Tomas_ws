package com.tomas.test.dyproxy.interfaceProxy;

/**
 * 实现类
 */
public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("RealSubject.doSomething()");
	}
}
