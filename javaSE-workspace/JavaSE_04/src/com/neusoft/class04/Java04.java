package com.neusoft.class04;

public class Java04 {

    public static void main(String[] args) {

        int[] a= {1,2,3,4,5};
        int[] b = {6,7,8};

        int[] c = new int[a.length+b.length];
        for (int i = 0,s = a.length; i <a.length; i++,s++) {
            c[i] = a[i];
            if(s<c.length)
            {
                c[s]=b[i];
            }
        }

        for (int i : c)
            System.out.println(i);

        a[12] =7;
    }
}
