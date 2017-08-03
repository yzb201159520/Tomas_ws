package com.testditest.testSort;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 快速排序法实践
 * Created by thomas on 2017/8/3.
 */
public class SortVector extends Vector
{
    private Compare compare;

    public SortVector(Compare compare) {
        this.compare = compare;
    }

    public void sort()
    {
//        quickSort(0,size()-1);
        quickSort2(0, size() - 1);

    }

    /**
     * 快速排序法的步骤
     * @param left
     * @param right
     */
    private void quickSort(int left, int right)
    {
        if (right>left)
        {
            // 1、选定一个数为基准数,此处为选择最右边的数，基准数的选择决定了后面的比较，以及换位
            Object o1 = elementAt(right);
            int i = left-1;
            int j = right;
            while(true)
            {
                // 2.从最左边开始依次向右尝试获取比基准数大的数，找到后暂停，
                // 从最右边-1开始依次尝试获取比基准数小的数，找到后暂停，然后将两者交换位置，
                // 继续循环，直到 左边的index i>=右边的j为止，此时表示i,j已经达到分块的界限
                // 此步的目的是使整个数组在 分块时，左边的块均小于基准值，右边的块均大于基准值
                while (compare.lessThan(elementAt(++i),o1));
                while (j>0)
                    if(compare.lessOrEqual(elementAt(--j),o1))
                        break;
                if (i>=j) break;//已经超过了分块的范围
                // 未超过分块范围时，调换两者位置
                swap(i,j);
            }
            // 3.按照循环的逻辑，此时 i处的值是比基准值大的，所以交换两者位置，此时分块真正完成。
            swap(i,right);
            // 前半块排序
            quickSort(left,i-1);
            // 后半块排序
            quickSort(i+1,right);
        }
    }

    /**
     * 以最左方为基准值的实现
     * @param left
     * @param right
     */
    public void quickSort2(int left,int right)
    {
        if(right>left)
        {
            Object o2 = elementAt(left);
            int i=left;
            int j=right+1;

            while (true)
            {
                while (compare.lessThan(elementAt(++i),o2));
                while (j>0)
                {
                    if (compare.lessOrEqual(elementAt(--j),o2))
                        break;
                }
                if (i>=j)
                    break;
                swap(i,j);
            }
            // 此时j值仍比基准值小，与基准值换位
            swap(left,j);
            quickSort2(left, j - 1);
            quickSort2(j + 1, right);
        }
    }

    private void swap(int i, int j) {
        Object temp = elementAt(i);
        setElementAt(elementAt(j),i);
        setElementAt(temp,j);
    }

    static class MyCompare implements Compare
    {
        public boolean lessThan(Object lho, Object rho) {
            return ((String)lho).toLowerCase().compareTo(((String)rho))<0;
        }

        public boolean lessOrEqual(Object lho, Object rho) {
            return ((String)lho).toLowerCase().compareTo(((String)rho))<=0;
        }
    }

    public static void main(String[] args) {
        SortVector vector = new SortVector(new MyCompare());
        vector.add("11");
        vector.add("16");
        vector.add("18");
        vector.add("156");
        vector.add("1134");
        vector.add("14353");
        vector.add("1123");
        vector.add("113");
        vector.add("156");
        vector.add("15");
        vector.sort();
        printData(vector.elements());

//        System.out.println("21".toLowerCase().compareTo("201")<0);
    }

    private static void printData(Enumeration e)
    {
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
