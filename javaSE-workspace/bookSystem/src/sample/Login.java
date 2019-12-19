package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

import static javafx.stage.StageStyle.TRANSPARENT;

public class Login{
    public TextField text_account;
    public PasswordField text_password;
    public static boolean is_open=true;
    public static String login_account=new String();

    public Login() throws FileNotFoundException {
    }
    public void click_btn_backpassword() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("backPassword.fxml"));
        Stage backPassword=new Stage();

        backPassword.getIcons().add(
                new Image(
                        Login.class.getResourceAsStream( "pic/bookSystem.png" )));

        backPassword.setTitle("backPassword");
        Scene scene = new Scene(root,450,576);
        backPassword.setResizable(false);
        backPassword.initStyle(TRANSPARENT);
        backPassword.setScene(scene);
        backPassword.show();
    }

    public void click_btn_signin() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("questionNaire.fxml"));
        Stage questionNaire=new Stage();

        questionNaire.getIcons().add(
                new Image(
                        Login.class.getResourceAsStream( "pic/bookSystem.png" )));
        questionNaire.setTitle("入馆测试");
        Scene scene = new Scene(root, 870, 820);
        questionNaire.setResizable(false);
        questionNaire.setScene(scene);
        questionNaire.show();
    }

    public void click_btn_login() throws IOException {
        String account=text_account.getText();
        login_account=account;
        String password=text_password.getText();

        File user_file=new File("user.txt");
        Scanner read_user=new Scanner(user_file);
        ArrayList<String> user_list=new ArrayList<>();
        ArrayList<String> account_list=new ArrayList<>();
        ArrayList<String> password_list=new ArrayList<>();

        while (read_user.hasNext()){
            String str =read_user.nextLine();
            user_list.add(str);
        }
        for (int i=0;i<user_list.size();i++){
            account_list.add(((user_list.get(i)).split(","))[0]);
            password_list.add(((user_list.get(i)).split(","))[1]);
        }

        if(account.equals("admin")&&password.equals("000")){
            Parent root = FXMLLoader.load(getClass().getResource("homeAdmin.fxml"));
            Stage homeAdmin=new Stage();

            homeAdmin.getIcons().add(
                    new Image(
                            Login.class.getResourceAsStream( "pic/bookSystem.png" )));

            homeAdmin.setTitle("管理员主界面");
            Scene scene = new Scene(root,1500,844);
            homeAdmin.setScene(scene);
            homeAdmin.setResizable(false);
            homeAdmin.initStyle(TRANSPARENT);
            homeAdmin.show();
            Stage stage = (Stage) text_account.getScene().getWindow();
            stage.close();
        }
        else if((account_list.contains(account))&&(password_list.contains(password))){
            Parent root = FXMLLoader.load(getClass().getResource("homeUser.fxml"));
            Stage homeUser=new Stage();
            homeUser.getIcons().add(
                    new Image(
                            Login.class.getResourceAsStream( "pic/bookSystem.png" )));
            homeUser.setTitle("用户主界面");
            Scene scene = new Scene(root,1500,844);
            homeUser.setScene(scene);
            homeUser.setResizable(false);
            homeUser.initStyle(TRANSPARENT);
            homeUser.show();
            Stage stage = (Stage) text_account.getScene().getWindow();
            stage.close();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("登录失败");
            alert.setContentText("请输入正确的账户与密码！");
            alert.initStyle(TRANSPARENT);
            alert.show();
        }
    }

    public void click_btn_close(){
        Stage stage = (Stage) text_account.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) text_account.getScene().getWindow();
        stage.setIconified(true);
    }

}
