package com.neusoft.Annaction;

public class Main {

    public static void main(String[] args) {
        Hint hint = Student.class.getAnnotation(Hint.class);
        System.out.println(hint);                   // null
        Hints hints1 = Student.class.getAnnotation(Hints.class);
        System.out.println(hints1.value().length);  // 2
        Hint[] hints2 = Student.class.getAnnotationsByType(Hint.class);
        System.out.println(hints2.length);

        System.out.println(hints2[0].age());
        System.out.println(hints2[1].value());
    }
}
