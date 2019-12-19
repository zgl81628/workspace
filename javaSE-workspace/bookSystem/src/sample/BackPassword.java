package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static javafx.stage.StageStyle.TRANSPARENT;

public class BackPassword {
    public Button sendChangeButton;
    public Button confirmChangeButton;

    public TextField idChangeText;
    public TextField newPasswordText;
    public TextField numChangeText;

    public HtmlEmail email = new HtmlEmail();
    public  AtomicInteger num = new AtomicInteger();
    public File userFile = new File("user.txt");
    ArrayList<String> userS = new ArrayList<>();

   public void  click_sendChangeButton() throws EmailException, FileNotFoundException {
       email.setHostName("smtp.qq.com");
       email.setCharset("utf-8");
       email.setFrom("1299554123@qq.com", "图书");
       email.setAuthentication("1299554123@qq.com", "oubztgrnqbrfbafi");
       Scanner userInput = new Scanner(userFile);

       while (userInput.hasNext()) {
           userS.add(userInput.nextLine());
       }
       userInput.close();
       for (int i = 0; i <userS.size(); i++) {
           ArrayList<String> user_line=new ArrayList( Arrays.asList((userS.get(i)).split(",")));
           if((idChangeText.getText()).equals(user_line.get(0))){
               num.set((int) (Math.random() * 9000) + 1000);
               email.addTo(user_line.get(3));
               email.setSubject("图书管理系统 密码修改验证");
               email.setMsg("亲爱的用户：\n"+
                       "你的账号邮箱验证码为: "+ num+" ,请勿转发他人 !\n"+
                       "铁道游击队敬上");
               email.send();
               break;
           }
           else{
               if(i==(userS.size()-1)){
                   Alert alert = new Alert(Alert.AlertType.ERROR);
                   alert.setHeaderText("发送失败");
                   alert.setContentText("不存在该用户！");
                   alert.initStyle(TRANSPARENT);
                   alert.show();
               }
           }

       }

   }

    public void  click_confirmChangeButton() throws FileNotFoundException {

        if (numChangeText.getText().equals("" + num)) {
            PrintWriter userOutput = new PrintWriter(userFile);
            for (int i = 0; i < userS.size(); i++) {
                String str = new String();
                String name=((userS.get(i)).split(","))[0];
                if (name.equals(idChangeText.getText())) {
                    str = (userS.get(i).split(","))[0] + ","
                            + newPasswordText.getText() + ","
                            + (userS.get(i).split(","))[2] + ","
                            + (userS.get(i).split(","))[3];
                } else {
                    str = userS.get(i);
                }

                if (i == userS.size() - 1) {
                    userOutput.print(str);
                }
                else {
                    userOutput.println(str);
                }
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("修改成功");
            alert.setContentText("该用户已成功修改密码！");
            alert.initStyle(TRANSPARENT);
            alert.show();
            idChangeText.setText("");
            newPasswordText.setText("");
            numChangeText.setText("");
            userOutput.close();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("修改失败");
            alert.setContentText("验证码错误！");
            alert.initStyle(TRANSPARENT);
            alert.show();
        }
    }

    public void click_btn_close(){
        Stage stage = (Stage) idChangeText.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) idChangeText.getScene().getWindow();
        stage.setIconified(true);
    }


}


