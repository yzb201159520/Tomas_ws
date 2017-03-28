package com.tomas.test.dyproxy.staticProxy;

public class AProxyTeacher implements Teacher {
	
	private TeacherImpl teacherImpl;
	
	public AProxyTeacher(TeacherImpl teacherImpl) {
		this.teacherImpl = teacherImpl;
	}

	@Override
	public void techStu() {
		System.out.println("------AProxyTeacher.techStu()------");
		teacherImpl.techStu();
		System.out.println("------AProxyTeacher.techStu().finished------");
	}

}
