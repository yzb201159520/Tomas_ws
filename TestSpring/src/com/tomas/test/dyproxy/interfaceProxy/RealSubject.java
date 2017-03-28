package com.tomas.test.dyproxy.interfaceProxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("RealSubject.doSomething()");
	}

}
