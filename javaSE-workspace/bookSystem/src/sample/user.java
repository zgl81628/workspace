package sample;

import java.util.ArrayList;
import java.util.Arrays;

public class user {
    public String user_name;
    public String user_password;
    public String user_booklist;
    public String user_email;

    public user(){

    }


    public user(String user_info) {
        this.user_name = (user_info.split(","))[0];
        this.user_password =(user_info.split(","))[1];
        this.user_booklist = (user_info.split(","))[2];
        this.user_email = (user_info.split(","))[3];
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_booklist() {
        return user_booklist;
    }

    public void setUser_booklist(String user_booklist) {
        this.user_booklist = user_booklist;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
}
