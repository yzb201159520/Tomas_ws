package com.testditest.testSort;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ��������ʵ��
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
     * �������򷨵Ĳ���
     * @param left
     * @param right
     */
    private void quickSort(int left, int right)
    {
        if (right>left)
        {
            // 1��ѡ��һ����Ϊ��׼��,�˴�Ϊѡ�����ұߵ�������׼����ѡ������˺���ıȽϣ��Լ���λ
            Object o1 = elementAt(right);
            int i = left-1;
            int j = right;
            while(true)
            {
                // 2.������߿�ʼ�������ҳ��Ի�ȡ�Ȼ�׼����������ҵ�����ͣ��
                // �����ұ�-1��ʼ���γ��Ի�ȡ�Ȼ�׼��С�������ҵ�����ͣ��Ȼ�����߽���λ�ã�
                // ����ѭ����ֱ�� ��ߵ�index i>=�ұߵ�jΪֹ����ʱ��ʾi,j�Ѿ��ﵽ�ֿ�Ľ���
                // �˲���Ŀ����ʹ���������� �ֿ�ʱ����ߵĿ��С�ڻ�׼ֵ���ұߵĿ�����ڻ�׼ֵ
                while (compare.lessThan(elementAt(++i),o1));
                while (j>0)
                    if(compare.lessOrEqual(elementAt(--j),o1))
                        break;
                if (i>=j) break;//�Ѿ������˷ֿ�ķ�Χ
                // δ�����ֿ鷶Χʱ����������λ��
                swap(i,j);
            }
            // 3.����ѭ�����߼�����ʱ i����ֵ�ǱȻ�׼ֵ��ģ����Խ�������λ�ã���ʱ�ֿ�������ɡ�
            swap(i,right);
            // ǰ�������
            quickSort(left,i-1);
            // ��������
            quickSort(i+1,right);
        }
    }

    /**
     * ������Ϊ��׼ֵ��ʵ��
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
            // ��ʱjֵ�ԱȻ�׼ֵС�����׼ֵ��λ
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
