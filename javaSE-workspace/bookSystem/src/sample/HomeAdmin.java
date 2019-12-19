package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.stage.StageStyle.TRANSPARENT;

public class HomeAdmin {
    @FXML
    public Button btn_search;

    public void click_btn_add() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addBook.fxml"));
        Stage addBook=new Stage();
        addBook.getIcons().add(
                new Image(
                        HomeAdmin.class.getResourceAsStream( "pic/bookSystem.png" )));

        addBook.setTitle("addBook");
        Scene scene = new Scene(root,1500,844);
        addBook.setScene(scene);
        addBook.setResizable(false);
        addBook.initStyle(TRANSPARENT);
        addBook.show();
    }

    public void click_btn_delete() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("deleteBook.fxml"));
        Stage deleteBook=new Stage();
        deleteBook.getIcons().add(
                new Image(
                        HomeAdmin.class.getResourceAsStream( "pic/bookSystem.png" )));


        deleteBook.setTitle("deleteBook");
        Scene scene = new Scene(root,1500,844);
        deleteBook.setScene(scene);
        deleteBook.setResizable(false);
        deleteBook.initStyle(TRANSPARENT);
        deleteBook.show();
    }

    public void click_btn_search() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("searchAdmin.fxml"));
        Stage searchAdmin=new Stage();
        searchAdmin.getIcons().add(
                new Image(
                        HomeAdmin.class.getResourceAsStream( "pic/bookSystem.png" )));

        searchAdmin.setTitle("searchAdmin");
        Scene scene = new Scene(root,1500,844);
        searchAdmin.setScene(scene);
        searchAdmin.setResizable(false);
        searchAdmin.initStyle(TRANSPARENT);
        searchAdmin.show();
    }

    public void click_btn_user() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("userLook.fxml"));
        Stage userLook=new Stage();
        userLook.getIcons().add(
                new Image(
                        HomeAdmin.class.getResourceAsStream( "pic/bookSystem.png" )));


        userLook.setTitle("userLook");
        Scene scene = new Scene(root,797,731);
        userLook.setScene(scene);
        userLook.setResizable(false);
        userLook.initStyle(TRANSPARENT);
        userLook.show();
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
