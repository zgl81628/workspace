package com.neusoft.work;

public class Test01 {

    public static void main(String[] args) {

        Student[] stus = {
                new Student("张三1","2019214551145221",95f),
                new Student("张三2","2019214551145221",78f),
                new Student("张三3","2019214551145221",65f),
                new Student("张三4","2019214551145221",45f),
                new Student("张三5","2019214551145221",80f),
        };

        for (int i = 0; i <stus.length-1 ; i++) {
            for (int j = 0; j <stus.length-1-i ; j++) {
                if(stus[j].equals(stus[j+1]))
                {
                    Student temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }

        System.out.println("排序后的结果:");
        for (Student s:stus) {
            System.out.println(s);
        }
    }
}
