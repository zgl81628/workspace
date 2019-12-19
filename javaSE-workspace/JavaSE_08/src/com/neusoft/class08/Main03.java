package com.neusoft.class08;

public class Main03 {

    public static void main(String[] args) {

        try{
            throw new MyExecption("我的自己定义异常");
        }catch (MyExecption execption)
        {
            System.out.println(execption);
        }


    }
}
