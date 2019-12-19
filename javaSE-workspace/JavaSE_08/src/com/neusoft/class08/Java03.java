package com.neusoft.class08;

public class Java03 {


    public void run() throws NullPointerException{

        throw new NullPointerException("空指针异常");
    }

    public void run01() {

        try {
            throw new NullPointerException("空指针异常");
        }catch (NullPointerException e)
        {

        }
    }
}
