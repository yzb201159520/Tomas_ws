package com.testditest.testAsync;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by thomas on 2017/8/21.
 */
public class TestAsyncThread {
    static final TestObj testObj = new TestObj();
    public static void main(String[] args) {
        System.out.println("测试同步快");
        new Thread1().start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread2().start();
    }
}
class Thread1 extends Thread
{
    @Override
    public void run()
    {
//        System.out.println("�߳�һ"+Thread1.this+"  ���Խ����һ������");
//        TestAsyncThread.testObj.testMethod1();
//        System.out.println("�߳�һ"+Thread1.this+"  ���Խ���ڶ�������");
//        TestAsyncThread.testObj.testMethod2();
        TestAsyncThread.testObj.testMethod3();
    }
}

class Thread2 extends Thread
{
    @Override
    public void run() {
//        System.out.println("哈哈哈"+Thread2.this+"  ���Խ���ڶ�������");
//        TestAsyncThread.testObj.testMethod2();
        TestAsyncThread.testObj.testMethod3();
    }
}

class TestObj
{
    public synchronized void testMethod1()
    {
        System.out.println(this+"�����˵�һ��������"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        try {
            Thread.currentThread().sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void testMethod2()
    {
        System.out.println(this+"�����˵ڶ���������"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }

    public void testMethod3()
    {
        System.out.println(Thread.currentThread()+"进入测试方法三");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this)
        {
            System.out.println(Thread.currentThread()+"进入同步快内部");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}