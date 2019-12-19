package sample;

public class bookAdmin {
    public String table_name ;
    public String table_num ;
    public String table_type ;
    public String table_press ;
    public String table_writer ;
    public String table_isOut ;
    public String table_lentTo;
    public String table_fre ;


    public bookAdmin(String str) {
        String[] strs = str.split(",");
        this.table_name = strs[0];
        this.table_num = strs[1];
        this.table_type = strs[2];
        this.table_press = strs[3];
        this.table_writer = strs[4];
        this.table_isOut = strs[5];
        this.table_lentTo=strs[6];
        this.table_fre = strs[7];
    }

    public String getTable_name() { return table_name; }

    public void setTable_name(String table_name) { this.table_name = table_name; }

    public String getTable_num() {
        return table_num;
    }

    public void setTable_num(String table_num) {
        this.table_num = table_num;
    }

    public String getTable_type() {
        return table_type;
    }

    public void setTable_type(String table_type) {
        this.table_type = table_type;
    }

    public String getTable_press() { return table_press; }

    public void setTable_press(String table_press) {
        this.table_press = table_press;
    }

    public String getTable_writer() {
        return table_writer;
    }

    public void setTable_writer(String table_writer) {
        this.table_writer = table_writer;
    }

    public String getTable_isOut() {
        return table_isOut;
    }

    public void setTable_isOut(String table_isOut) {
        this.table_isOut = table_isOut;
    }

    public String getTable_fre() {
        return table_fre;
    }

    public void setTable_fre(String table_fre) {
        this.table_fre = table_fre;
    }

    public String getTable_lentTo() { return table_lentTo; }

    public void setTable_lentTo(String table_lentTo) { this.table_lentTo = table_lentTo; }

}




