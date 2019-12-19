package com.neusoft.work;

public class Student {

    private String name;
    private String sno;
    private float score;

    public Student() {
    }

    public Student(String name, String sno, float score) {
        this.name = name;
        this.sno = sno;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.score>((Student) obj).score)
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                ", score=" + score +
                '}';
    }
}
