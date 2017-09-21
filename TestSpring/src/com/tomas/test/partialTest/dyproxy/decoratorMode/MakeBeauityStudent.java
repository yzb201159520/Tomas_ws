package com.tomas.test.partialTest.dyproxy.decoratorMode;

/**
 * 装饰类
 */
public class MakeBeauityStudent implements Student{
	
	// 装饰类也获得了一个 真实对象的引用
	private Student stuToBeDecorate;
	
	public MakeBeauityStudent(Student stuToBeDecorate) {
		this.stuToBeDecorate = stuToBeDecorate;
	}
	
	/**
	 * 装饰类的方法会执行附加的增强动作，并执行真实对象的方法
	 */
	@Override
	public void beauityStudent() {
		System.out.println("------MakeBeauityStudent.beauityStudent()------");
		stuToBeDecorate.beauityStudent();
		System.out.println("------MakeBeauityStudent.beauityStudent().finish------");
	}
}
