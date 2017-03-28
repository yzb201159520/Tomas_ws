package com.tomas.test.dyproxy.decoratorMode;

public class TestDecorator {
	
	public static void main(String[] args) {
		NarmalStudent student = new NarmalStudent();
		// 第一次装饰
		Student decoStu = new MakeBeauityStudent(student);
		decoStu.beauityStudent();
		System.out.println("");
		// 第二次装饰
		Student deDecoStu = new MakeBeauityStudent(decoStu);
		deDecoStu.beauityStudent();
		
	}
}
