package com.tomas.test.partialTest.singleton;

/**
 * 饿汉式单例1
 */
public class SingletonStudent {
	// 在类加载时就将其初始化 或者置于静态块中
	private static SingletonStudent singleStudent =new SingletonStudent();
	
	// 私有化构造器
	private SingletonStudent(){};
	
	public static SingletonStudent getInstance()
	{
		return SingletonStudent.singleStudent;
	}
}
