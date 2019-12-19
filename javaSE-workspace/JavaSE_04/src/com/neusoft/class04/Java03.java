package com.neusoft.class04;

public class Java03 {
    public static void main(String[] args) {

        int[][] a = {{1,2,3,4},{9,0,5,7,56},{2,3,4,5,5}};

        for (int[] b:a) {
            for (int c:b) {
                System.out.print(c+"\t");
            }
            System.out.println();
        }

    }
}
