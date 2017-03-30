package com.tomas.test.partialTest.dyproxy.staticProxy;

/**
 * 代理接口的真实实现类
 */
public class TeacherImpl implements Teacher{

	@Override
	public void techStu() {
		System.out.println("TeacherImpl.techStu()");
	}
}
