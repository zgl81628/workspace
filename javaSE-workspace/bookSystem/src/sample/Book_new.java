package sample;

import javafx.beans.InvalidationListener;
import javafx.beans.property.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book_new {
    private String bookName;                //书名
    private String bookNum;                 //书号
    private String bookType;                //类型
    private String bookPress;               //出版社
    private String bookWriter;              //作者
    private SimpleBooleanProperty isOut;    //是否借出
    private SimpleStringProperty lentTo;    //借给了谁，如果没有借出，那么其值为“000”
    private Date outDate;//借出的日期
    private SimpleIntegerProperty bookFre;  //被借阅的次数
    private SimpleIntegerProperty bookRank; //排名

    //以下所有构造方法都不能传入bookRank,因为bookRank将被初始化为0
    //全部类型为类自带的类型
    public Book_new(String bookName, String bookNum, String bookType, String bookPress, String bookWriter,
                SimpleBooleanProperty isOut, SimpleStringProperty lentTo, Date outDate, SimpleIntegerProperty bookFre) {
        this.bookName = bookName;
        this.bookNum = bookNum;
        this.bookType = bookType;
        this.bookPress = bookPress;
        this.bookWriter = bookWriter;
        this.isOut = isOut;
        this.lentTo = lentTo;
        this.outDate = outDate;
        this.bookFre = bookFre;

        this.bookRank = new SimpleIntegerProperty(0);
    }

    //全部类型为类自带，但是不包括Date的初始化
    public Book_new(String bookName, String bookNum, String bookType, String bookPress, String bookWriter,
                SimpleBooleanProperty isOut, SimpleStringProperty lentTo, SimpleIntegerProperty bookFre) {
        this.bookName = bookName;
        this.bookNum = bookNum;
        this.bookType = bookType;
        this.bookPress = bookPress;
        this.bookWriter = bookWriter;
        this.isOut = isOut;
        this.lentTo = lentTo;
        this.bookFre = bookFre;

        this.bookRank = new SimpleIntegerProperty(0);
    }

    //全部类型为String
    public Book_new(String bookName, String bookNum, String bookType, String bookPress, String bookWriter, String isOut, String lentTo, String outDate, String bookFre) throws ParseException {
        this.bookName = bookName;
        this.bookNum = bookNum;
        this.bookType = bookType;
        this.bookPress = bookPress;
        this.bookWriter = bookWriter;

        if(isOut.equals("借出")){
            this.isOut = new SimpleBooleanProperty(true);
        }
        else this.isOut = new SimpleBooleanProperty(false);

        this.lentTo = new SimpleStringProperty(lentTo);

        //用SimpleDateFormat确定日期格式，然后用parse()方法得到日期
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String outDateString = outDate.toString();
        this.outDate = ft.parse(outDateString);

        this.bookFre = new SimpleIntegerProperty(Integer.parseInt(bookFre.toString()));

        this.bookRank = new SimpleIntegerProperty(0);
    }

    //全部类型为String,且不包括date
    public Book_new(String bookName, String bookNum, String bookType, String bookPress, String bookWriter, String isOut, String lentTo, String bookFre) {
        this.bookName = bookName;
        this.bookNum = bookNum;
        this.bookType = bookType;
        this.bookPress = bookPress;
        this.bookWriter = bookWriter;

        if(isOut.equals("借出")){
            this.isOut = new SimpleBooleanProperty(true);
        }
        else this.isOut = new SimpleBooleanProperty(false);

        this.lentTo = new SimpleStringProperty(lentTo);

        this.bookFre = new SimpleIntegerProperty(Integer.parseInt(bookFre.toString()));

        this.bookRank = new SimpleIntegerProperty(0);
    }

    //bookName
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //bookNum
    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    //bookType
    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    //bookPress
    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress;
    }

    //bookWriter
    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    //isOut
    public boolean isIsOut() {
        return isOut.get();
    }

    public SimpleBooleanProperty isOutProperty() {
        return isOut;
    }

    public void setIsOut(boolean isOut) {
        this.isOut.set(isOut);
    }

    //lentTo
    public String getLentTo() {
        return lentTo.get();
    }

    public SimpleStringProperty lentToProperty() {
        return lentTo;
    }

    public void setLentTo(String lentTo) {
        this.lentTo.set(lentTo);
    }

    //outDate
    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    //bookFre
    public int getBookFre() {
        return bookFre.get();
    }

    public SimpleIntegerProperty bookFreProperty() {
        return bookFre;
    }

    public void setBookFre(int bookFre) {
        this.bookFre.set(bookFre);
    }

    //bookRank
    public int getBookRank() {
        return bookRank.get();
    }

    public SimpleIntegerProperty bookRankProperty() {
        return bookRank;
    }

    public void setBookRank(int bookRank) {
        this.bookRank.set(bookRank);
    }

}
