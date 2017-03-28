package com.tomas.test.dyproxy.staticProxy;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		TeacherImpl teacherImpl = new TeacherImpl();
		AProxyTeacher proxyTeacher = new AProxyTeacher(teacherImpl);
		proxyTeacher.techStu();
		// 此举证明了 装饰模式和静态代理模式 或许有逻辑侧重点的区别，但是代码实现上没有区别
		AProxyTeacher proxyTeacher2 = new AProxyTeacher(proxyTeacher);
		proxyTeacher2.techStu();
	}
}
