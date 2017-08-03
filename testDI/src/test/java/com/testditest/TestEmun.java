package com.testditest;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Objects;
import java.util.Vector;

/**
 * Created by thomas on 2017/8/3.
 */
public class TestEmun {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for(int i=0;i<10;i++)
        {
            vector.add(new Teacher());
        }

        Hashtable hashtable = new Hashtable();
        for(int i=0;i<10;i++)
        {
            hashtable.put(""+i,new Students());
        }

        printData(hashtable.elements());
        printData(vector.elements());
    }

    public static void printData(Enumeration enumeration)
    {
        while(enumeration.hasMoreElements())
        {
            Object obj = enumeration.nextElement();
            System.out.println (obj);
            if (obj instanceof Students)
            {
                ((Students)obj).say();
            }else if (obj instanceof Teacher)
            {
                ((Teacher)obj).say();
            }
        }
    }
}

class Teacher
{
    static int teacherNum = 0;
    private int selfNum;
    public Teacher() {
        selfNum=++teacherNum;
    }

    public void say()
    {
        System.out.println("Teacher say Hello "+selfNum);
    }
}

class Students
{
    static int stuNum = 0;
    private int selfNum;
    public Students() {
        selfNum=++stuNum;
    }

    public void say()
    {
        System.out.println("Teacher say Hello "+selfNum);
    }
}