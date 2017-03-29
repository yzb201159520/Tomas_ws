package com.tomas.test.dyproxy.staticProxy;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		TeacherImpl teacherImpl = new TeacherImpl();
		AProxyTeacher proxyTeacher1 = new AProxyTeacher(teacherImpl);
		proxyTeacher1.techStu();
		System.out.println(" ");
		// 为了表示真实的代理对象不一定从外部获得
		AProxyTeacher proxyTeacher2 = new AProxyTeacher();
		proxyTeacher2.techStu();
		System.out.println(" ");
		// 二次代理
		AProxyTeacher proxyTeacher3 = new AProxyTeacher(proxyTeacher1);
		proxyTeacher3.techStu();
	}
}
