package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import static javafx.stage.StageStyle.TRANSPARENT;

public class QuestionNaire {

    public Button submitbutton;

    @FXML RadioButton t_11;@FXML RadioButton t_12;@FXML RadioButton t_13;
    @FXML RadioButton t_21;@FXML RadioButton t_22;@FXML RadioButton t_23;
    @FXML RadioButton t_31;@FXML RadioButton t_32;@FXML RadioButton t_33;
    @FXML RadioButton t_41;@FXML RadioButton t_42;@FXML RadioButton t_43;
    @FXML RadioButton t_51;@FXML RadioButton t_52;@FXML RadioButton t_53;
    @FXML RadioButton t_61;@FXML RadioButton t_62;@FXML RadioButton t_63;
    @FXML RadioButton t_71;@FXML RadioButton t_72;@FXML RadioButton t_73;
    @FXML RadioButton t_81;@FXML RadioButton t_82;@FXML RadioButton t_83;
    @FXML RadioButton t_91;@FXML RadioButton t_92;@FXML RadioButton t_93;
    @FXML RadioButton t_101;@FXML RadioButton t_102;@FXML RadioButton t_103;

    private Stage questionaireStage;

    public void recruitSubmit(ActionEvent actionevent) throws Exception {
        int score = 0;
        boolean finish=true;

        if(t_11.isSelected()||t_12.isSelected()||t_13.isSelected()) {

            if(t_12.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_21.isSelected()||t_22.isSelected()||t_23.isSelected()) {

            if(t_23.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_31.isSelected()||t_32.isSelected()||t_33.isSelected()) {

            if(t_32.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_41.isSelected()||t_42.isSelected()||t_43.isSelected()) {

            if(t_41.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_51.isSelected()||t_52.isSelected()||t_53.isSelected()) {

            if(t_52.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_61.isSelected()||t_62.isSelected()||t_63.isSelected()) {

            if(t_61.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_71.isSelected()||t_72.isSelected()||t_73.isSelected()) {

            if(t_71.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_81.isSelected()||t_82.isSelected()||t_83.isSelected()) {

            if(t_83.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_91.isSelected()||t_92.isSelected()||t_93.isSelected()) {

            if(t_93.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);
        if(t_101.isSelected()||t_102.isSelected()||t_103.isSelected()) {

            if(t_101.isSelected())
                score+=10;
        }
        else
            finish=false;
        System.out.println(score);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("提示");
        alert.setHeaderText(null);
        questionaireStage = (Stage) submitbutton.getScene().getWindow();
        if(finish==false){
            alert.setContentText("请填完所有问题后再提交");
            alert.showAndWait();}
        else if(score>=80) {
            alert.setContentText("恭喜你！请开始注册。");
            alert.showAndWait();
            questionaireStage.close();
            Parent root = FXMLLoader.load(getClass().getResource("signin.fxml"));
            Stage userSignin=new Stage();
            userSignin.setTitle("userSignin");
            Scene scene = new Scene(root,450,690);
            userSignin.setResizable(false);
            userSignin.initStyle(TRANSPARENT);
            userSignin.setScene(scene);
            userSignin.show();
        }else {
            alert.setContentText("抱歉，目前您的成绩不适合注册图书管理系统，请学习后再进行注册");
            questionaireStage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("questionNaire.fxml"));
            questionaireStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("questionNaire.fxml"));
            questionaireStage.setTitle("入馆测试");
            questionaireStage.setScene(new Scene(root, 800, 900));
            questionaireStage.show();
            alert.showAndWait();
        }
    }

}
