package com.tomas.test.dyproxy.absClassProxy;


public class TestCglibProxy {
	
	public static void main(String[] args) {
		InstanceLession insLession = new InstanceLession();
		Lession proxyLession = (Lession) new InstProxyHandler().getInstance(insLession);
		
		proxyLession.teachLession();
	}
}
