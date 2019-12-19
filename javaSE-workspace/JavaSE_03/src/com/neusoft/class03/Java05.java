package com.neusoft.class03;

import java.util.Scanner;

public class Java05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("一级菜单...***************");
            System.out.println("0.退出");
            System.out.println("1.菜单");
            System.out.println("2.菜单");
            System.out.println("3.菜单");
            System.out.println("4.菜单");
            System.out.println("请输入数字操作");
            int a = sc.nextInt();
            switch (a)
            {
                case 0:
                    System.out.println("程序正常退出.....");
                    System.exit(0);
                    break;
                case 1:
                     boolean flag = true;
                     do{
                         System.out.println("二级菜单...***************");
                         System.out.println("0.返回主菜单");
                         System.out.println("1.菜单");
                         System.out.println("2.菜单");
                         System.out.println("请输入数字操作");
                         int b = sc.nextInt();
                         switch (b)
                         {
                             case 0 :
                                 System.out.println("返回上级主界面");
                                 flag = false;
                                 break;
                             case 1:
                                 System.out.println("菜单1");
                                 break;
                             case 2:
                                 System.out.println("菜单2");
                                 break;
                         }
                     }while(flag);

                     break;
                case 2:
                    System.out.println("菜单2");
                    break;
                case 3:
                    System.out.println("菜单3");
                    break;
                case 4:
                    System.out.println("菜单4");
                    break;
            }
        }while(true);
    }
}
