package com.neusoft.class09;

public class MyObject {

    //内存地址
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //hashCode
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //hashCode
    @Override
    public String toString() {
        return "自己重新写的代码";
    }


    //垃圾回收
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
