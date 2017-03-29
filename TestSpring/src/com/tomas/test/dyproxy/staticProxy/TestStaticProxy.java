package com.tomas.test.dyproxy.staticProxy;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		TeacherImpl teacherImpl = new TeacherImpl();
		AProxyTeacher proxyTeacher = new AProxyTeacher(teacherImpl);
		proxyTeacher.techStu();
		// 为了表示真实的代理对象不一定从外部获得
		
		AProxyTeacher proxyTeacher2 = new AProxyTeacher();
		proxyTeacher2.techStu();
	}
}
