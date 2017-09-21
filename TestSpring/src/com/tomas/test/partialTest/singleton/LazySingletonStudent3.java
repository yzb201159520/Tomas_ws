package com.tomas.test.partialTest.singleton;

/**
 * 懒汉式单例第三种
 */
public class LazySingletonStudent3 {
	
	private LazySingletonStudent3(){};
	
	/**
	 * 优点：利用内部类的延迟加载机制，在内部类加载时对自身变量进行初始化，完美解决了前两种方法的缺陷
	 */
	private static class InnerSingleStu{
		private static final LazySingletonStudent3 innerStu = new LazySingletonStudent3();
	}
	
	public static LazySingletonStudent3 getInstance()
	{
		return InnerSingleStu.innerStu;
	}
}
