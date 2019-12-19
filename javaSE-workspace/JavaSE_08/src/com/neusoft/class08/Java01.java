package com.neusoft.class08;

public class Java01 {

    public void show(){

//        try {
//            Class.forName("");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            String[] a = new String[3];
            a[3] = "";
            String str = null;
            str.charAt(10);

        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public void show01(){

        try {
            String[] a = new String[3];
            a[3] = "";
            String str = null;
            str.charAt(10);

        }
        catch(NullPointerException | IndexOutOfBoundsException |ArithmeticException e){
            System.out.println(e);
            return;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }finally {
            System.out.println("finally 语句执行");
        }

        System.out.println("*****************");
    }
}
