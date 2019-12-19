package com.neusoft.inner;

public class Outer02 {

    public void myFun(){

        final int a = 10;
         class  Inner{
            public void show(){
                 System.out.println(a);
            }
        }

        Inner inner = new Inner();
         inner.show();
    }
}
