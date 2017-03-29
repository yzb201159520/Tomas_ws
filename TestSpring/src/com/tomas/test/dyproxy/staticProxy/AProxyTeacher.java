package com.tomas.test.dyproxy.staticProxy;

/**
 * AProxyTeacher的代理类
 * 他继承了Teacher并重写了其方法
 * 使它的行为看起来同Teacher的真正实现类一样
 */
public class AProxyTeacher implements Teacher {
	
	// 但是实际上其持有了一个私有的Teacher实例，这才是动作的真正执行者
	private Teacher teacherImpl;
	
	// 该实例可以从外部获得，也可以通过其他方式产生
	public AProxyTeacher(Teacher teacherImpl) {
		this.teacherImpl = teacherImpl;
	}
	
	// 该实例可以从外部获得，也可以通过其他方式产生
	public AProxyTeacher() {
		this.teacherImpl =new TeacherImpl();
	}
	
	@Override
	public void techStu() {
		// 在真正操作的执行前后可以进行附加操作
		System.out.println("------AProxyTeacher.techStu()------");
		// 这才是动作的真正执行者
		teacherImpl.techStu();
		System.out.println("------AProxyTeacher.techStu().finished------");
	}
}
