package com.tomas.test.dyproxy.staticProxy;

public class AProxyTeacher implements Teacher {
	
	private Teacher teacherImpl;
	
	public AProxyTeacher(Teacher teacherImpl) {
		this.teacherImpl = teacherImpl;
	}

	@Override
	public void techStu() {
		System.out.println("------AProxyTeacher.techStu()------");
		teacherImpl.techStu();
		System.out.println("------AProxyTeacher.techStu().finished------");
	}

}
