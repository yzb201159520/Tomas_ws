package com.tomas.test.partialTest.singleton;

/**
 * 懒汉式单例第二种
 */
public class LazySingletonStudent2 {
	
	private static LazySingletonStudent2 student2 =null;
	
	private LazySingletonStudent2(){};
	
	/**
	 * 优点：满足懒加载需求，采用同步块的形式，使得加载完成的后续使用中对性能无影响
	 * 缺点：初次使用为多线程访问同时加载时有影响。
	 */
	public static LazySingletonStudent2 getInstance()
	{
		if(student2==null){
			synchronized (student2) {
				if(student2==null){
					student2=new LazySingletonStudent2();
				}
			}
		}
		return student2;
	}
}
