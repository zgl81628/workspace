package sample;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

import static javafx.stage.StageStyle.TRANSPARENT;

public class HomeUser {
    @FXML
    public Button btn_search;

    public void click_btn_search() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("searchUser.fxml"));
        Stage searchUser=new Stage();
        searchUser.getIcons().add(
                new Image(
                        HomeUser.class.getResourceAsStream( "pic/bookSystem.png" )));

        searchUser.setTitle("馆藏查询");
        Scene scene = new Scene(root,1500,844);
        searchUser.setScene(scene);
        searchUser.setResizable(false);
        searchUser.initStyle(TRANSPARENT);
        searchUser.show();
    }
    public void click_btn_lent() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("lentBook.fxml"));
        Stage lentBook=new Stage();

        lentBook.getIcons().add(
                new Image(
                        HomeUser.class.getResourceAsStream( "pic/bookSystem.png" )));
        lentBook.setTitle("借阅书籍");
        Scene scene = new Scene(root,1500,844);
        lentBook.setScene(scene);
        lentBook.setResizable(false);
        lentBook.initStyle(TRANSPARENT);
        lentBook.show();
    }
    public void click_btn_back() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("backBook.fxml"));
        Stage backBook=new Stage();
        backBook.getIcons().add(
                new Image(
                        HomeUser.class.getResourceAsStream( "pic/bookSystem.png" )));

        backBook.setTitle("归还书籍");
        Scene scene = new Scene(root,1500,844);
        backBook.setScene(scene);
        backBook.setResizable(false);
        backBook.initStyle(TRANSPARENT);
        backBook.show();
    }
    public void click_btn_user() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("userInfo.fxml"));
        Stage userInfo=new Stage();
        userInfo.getIcons().add(
                new Image(
                        HomeUser.class.getResourceAsStream( "pic/bookSystem.png" )));

        Scene scene = new Scene(root,1500,844);
        userInfo.setScene(scene);
        userInfo.setResizable(false);
        userInfo.initStyle(TRANSPARENT);
        userInfo.show();
    }


    public void click_btn_list() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("bookList.fxml"));
        Stage bookList=new Stage();

        bookList.getIcons().add(
                new Image(
                        HomeUser.class.getResourceAsStream( "pic/bookSystem.png" )));

        Scene scene = new Scene(root,1500,844);
        bookList.setScene(scene);
        bookList.setResizable(false);
        bookList.initStyle(TRANSPARENT);
        bookList.show();
        
    }

    public void click_btn_close(){
        Stage stage = (Stage) btn_search.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) btn_search.getScene().getWindow();
        stage.setIconified(true);
    }

}
