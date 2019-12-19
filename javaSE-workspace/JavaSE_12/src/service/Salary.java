package service;

import model.Prouduct;


import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Salary {

    private Scanner sc = new Scanner(System.in);


    public Prouduct getProuductByName(List<Prouduct> list,String name){
        return list.stream()
                .filter(prouduct -> prouduct.getpName().equals(name))
                .collect(Collectors.toList())
                .get(0);
    }


    /***
     * 促销
     */
    public void do_Salary(){

    }

    /***
     * 是否进行促销
     * @return
     */
    public boolean is_Salary(){

        return false;
    }

    /***
     * 输入促销价格
     * @param price
     * @param pprice
     * @return
     */
    public boolean input_Price(double price,double pprice){

        return pprice<pprice?true:false;
    }

    /***
     * 输入促销时间
     * @return
     */
    public boolean input_date(){
        System.out.println("促销开始时间");
        String start = sc.next();
        System.out.println("促销结束时间");
        String end = sc.next();

        return false;
    }

    /***
     * 保存促销信息
     */
    public void save_productInfo(Prouduct prouduct, List lists){

    }
}
