package com.tomas.test.partialTest.singleton;

/**
 * 懒汉式单例第一种
 */
public class LazySingletonStudent1 {
	
	private static LazySingletonStudent1 student1 =null;
	
	private LazySingletonStudent1(){};
	
	/**
	 * 优点：锁住这个方法，使得同时只有一个线程进入了方法，并且只有在调用到时才会被初始化，
	 * 缺点：虽然保证了单例，但是在单例被实例化后，仍然同时只有一个线程进入了方法，对性能影响严重
	 */
	public static synchronized LazySingletonStudent1 getInstance()
	{
		if(student1==null){
			student1=new LazySingletonStudent1();
		}
		return student1;
	}
}
