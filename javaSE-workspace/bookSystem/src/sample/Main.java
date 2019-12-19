package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


import static javafx.stage.StageStyle.TRANSPARENT;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("login");

        primaryStage.getIcons().add(
                new Image(
                        Main.class.getResourceAsStream( "pic/bookSystem.png" )));

        primaryStage.setScene(new Scene(root, 450, 628));
        primaryStage.setResizable(false);
        primaryStage.initStyle(TRANSPARENT);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
