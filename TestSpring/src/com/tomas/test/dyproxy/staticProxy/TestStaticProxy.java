package com.tomas.test.dyproxy.staticProxy;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		TeacherImpl teacherImpl = new TeacherImpl();
		AProxyTeacher proxyTeacher = new AProxyTeacher(teacherImpl);
		
		proxyTeacher.techStu();
	}
}
