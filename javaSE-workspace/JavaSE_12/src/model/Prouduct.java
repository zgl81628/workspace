package model;

import java.util.Date;

public class Prouduct {

    private String pName;
    private String pNO;
    private String qa;
    private Price pprice;

    public Prouduct() {

    }

    public Prouduct(String pName, String pNO, String qa, Price pprice) {
        this.pName = pName;
        this.pNO = pNO;
        this.qa = qa;
        this.pprice = pprice;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpNO() {
        return pNO;
    }

    public void setpNO(String pNO) {
        this.pNO = pNO;
    }

    public String getQa() {
        return qa;
    }

    public void setQa(String qa) {
        this.qa = qa;
    }

    public Price getPprice() {
        return pprice;
    }

    public void setPprice(Price pprice) {
        this.pprice = pprice;
    }

    @Override
    public String toString() {
        return "Prouduct{" +
                "pName='" + pName + '\'' +
                ", pNO='" + pNO + '\'' +
                ", qa=" + qa +
                "" + pprice +
                '}';
    }
}
