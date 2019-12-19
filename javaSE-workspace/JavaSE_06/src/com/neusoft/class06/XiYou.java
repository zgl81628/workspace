package com.neusoft.class06;

public class XiYou {

    private String name;
    private String wuqi;
    private String fity;
    private String nai;

    public XiYou(){

    }

    public XiYou(String name,String wuqi,String fity,String nai)
    {
        this.name = name;
        this.wuqi = wuqi;
        this.fity = fity;
        this.nai = nai;
    }

    @Override
    public String toString() {
        return "西游记游戏软件中的游戏人物{" +
                "name='" + name + '\'' +
                ", wuqi='" + wuqi + '\'' +
                ", fity='" + fity + '\'' +
                ", nai='" + nai + '\'' +
                '}';
    }
}
