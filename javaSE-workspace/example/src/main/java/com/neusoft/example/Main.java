package com.neusoft.example;

import com.neusoft.example.example_UI.Emp_UI;

public class Main {
    public static void main(String[] args) {
        Emp_UI ui = new Emp_UI();
        System.out.println("显示:");
        ui.showEmp();

        System.out.println("添加");
        ui.add_emp();
    }
}
