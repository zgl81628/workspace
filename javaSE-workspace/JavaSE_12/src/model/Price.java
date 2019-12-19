package model;

import java.util.Date;

public class Price {

//    单价
//    起始日期
//    截止日期

    private double pPrice;
    private Date start;
    private Date end;

    public Price() {

    }

    public Price(double pPrice, Date start, Date end) {
        this.pPrice = pPrice;
        this.start = start;
        this.end = end;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Price{" +
                "pPrice=" + pPrice +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
