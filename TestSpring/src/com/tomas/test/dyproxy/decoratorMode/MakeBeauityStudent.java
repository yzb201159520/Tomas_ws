package com.tomas.test.dyproxy.decoratorMode;

public class MakeBeauityStudent implements Student{
	
	private Student stuToBeDecorate;
	
	public MakeBeauityStudent(Student stuToBeDecorate) {
		this.stuToBeDecorate = stuToBeDecorate;
	}

	@Override
	public void beauityStudent() {
		System.out.println("------MakeBeauityStudent.beauityStudent()------");
		stuToBeDecorate.beauityStudent();
		System.out.println("------MakeBeauityStudent.beauityStudent().finish------");
	}
	
}
