package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static javafx.stage.StageStyle.TRANSPARENT;

public class Signin {
    public TextField idText;
    public TextField passwordText;
    public TextField emailText;
    public TextField numText;
    public Button sendButton;
    public Button confirmButton;

    HtmlEmail email = new HtmlEmail();
    AtomicInteger num = new AtomicInteger();
    File userFile = new File("user.txt");

    public void click_sendButton() throws EmailException {
        email.setHostName("smtp.qq.com");
        email.setCharset("utf-8");
        email.setFrom("1299554123@qq.com", "智能图书管理系统");
        email.setAuthentication("1299554123@qq.com", "oubztgrnqbrfbafi");
        num.set((int) (Math.random() * 9000) + 1000);
        email.addTo(emailText.getText());
        email.setSubject("图书管理系统 验证码");
        email.setMsg("亲爱的用户：\n"+
                     "你的账号邮箱验证码为: "+ num+" ,请勿转发他人 !\n"+
                     "铁道游击队敬上");
        email.send();

    }
    public void click_confirmButton() throws FileNotFoundException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initStyle(TRANSPARENT);
        Scanner userInput = new Scanner(userFile);
        ArrayList<String> userS = new ArrayList<>();
        while (userInput.hasNext()) {
            userS.add(userInput.nextLine());
        }
        userInput.close();
        for (int i = 0; i <userS.size() ; i++) {
            ArrayList<String> user_line=new ArrayList( Arrays.asList((userS.get(i)).split(",")));
            if (numText.getText().equals( "" + num) && !(user_line.contains((String)idText.getText()))) {
                if(i==userS.size()-1) {
                    userS.add(idText.getText() + "," + passwordText.getText() + ",无" + "," + emailText.getText());
                    PrintWriter userOutput = new PrintWriter(userFile);
                    for (int j = 0; j < (userS.size() - 1); j++) {
                        userOutput.println(userS.get(j));
                    }
                    userOutput.print(userS.get(userS.size() - 1));
                    userOutput.close();
                    alert.setHeaderText("注册成功");
                    alert.setContentText(idText.getText() + "用户已成功注册！");
                    alert.show();
                    idText.setText("");
                    passwordText.setText("");
                    emailText.setText("");
                    numText.setText("");
                    break;
                }
            }
            else if (numText.getText().equals( "" + num) && user_line.contains((String)idText.getText())){
                alert.setHeaderText("注册失败");
                alert.setContentText("用户名已存在！");
                alert.show();
                break;
            }
            else {
                alert.setHeaderText("注册失败");
                alert.setContentText("验证码错误！");
                alert.show();
                break;
            }

        }

    }

    public void click_btn_close(){
        Stage stage = (Stage) idText.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) idText.getScene().getWindow();
        stage.setIconified(true);
    }

}











