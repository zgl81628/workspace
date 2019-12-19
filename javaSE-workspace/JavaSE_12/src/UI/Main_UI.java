package UI;

import model.Price;
import model.Prouduct;

import java.util.Arrays;
import java.util.List;

public class Main_UI {

    private List<Prouduct> list = null;

     public Main_UI(){
         list = Arrays.asList(
                 new Prouduct("辣条1","la00012301","2019-12-12",new Price(4.5,null,null)),
                 new Prouduct("辣条2","la00012302","2019-12-12",new Price(4.5,null,null)),
                 new Prouduct("辣条3","la00012303","2019-12-12",new Price(4.5,null,null)),
                 new Prouduct("辣条4","la00012304","2019-12-12",new Price(4.5,null,null)),
                 new Prouduct("辣条5","la00012305","2019-12-12",new Price(4.5,null,null)),
                 new Prouduct("辣条6","la00012306","2019-12-12",new Price(4.5,null,null)),
                 new Prouduct("辣条7","la00012307","2019-12-12",new Price(4.5,null,null))
                 );
     }
    //主菜单
    public void menuUI(){

        System.out.println("1.查询商品......");
        System.out.println("1.查询商品......");
        System.out.println("1.查询商品......");
        System.out.println("1.查询商品......");
        System.out.println("0.退出......");
    }

    //查询
    public void show_Menu(){
        System.out.println("查询商品信息:");
        list.forEach(prouduct -> System.out.println(prouduct));
    }

    /***
     * 促销价格
     */
    public void salary_price(){
        System.out.println("请输入促销价格...");


    }

    /**
     * 促销时间
     */
    public void salary_date(){

    }

    /***
     * 保存促销价格
     */
    public void input_list(){

    }
}
