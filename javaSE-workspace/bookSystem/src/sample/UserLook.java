package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javafx.stage.StageStyle.TRANSPARENT;

public class UserLook {

    public TableView<user> tableview_show;
    public TableColumn user_name;
    public TableColumn user_password;
    public TableColumn user_booklist;
    public TableColumn user_email;

    public ObservableList<user> data;
    String select_name=new String();

    public void dataBind(ObservableList<user> list)
    {
        user_name.setCellValueFactory(new PropertyValueFactory("user_name"));
        user_password.setCellValueFactory(new PropertyValueFactory("user_password"));
        user_booklist.setCellValueFactory(new PropertyValueFactory("user_booklist"));
        user_email.setCellValueFactory(new PropertyValueFactory("user_email"));
        tableview_show.setItems(list);
    }

    public void click_btn_look() throws FileNotFoundException {
        File user_file=new File("user.txt");
        Scanner read_user=new Scanner(user_file);
        ArrayList<user> user_list=new ArrayList<>();
        while(read_user.hasNext()){
            String str=read_user.nextLine();
            user_list.add(new user(str));
        }
        data = FXCollections.observableArrayList(user_list);
        dataBind(data);
        read_user.close();
    }

    public  void  click_tableview(){
        user select_user= tableview_show.getSelectionModel().getSelectedItem();
        select_name=select_user.getUser_name();
    }

    public void click_btn_delete() throws IOException {
        File user_file=new File("user.txt");
        Scanner read_user=new Scanner(user_file);
        ArrayList<String> old_user=new ArrayList<>();
        ArrayList<String> new_user=new ArrayList<>();

        while(read_user.hasNext()){
            old_user.add(read_user.nextLine());
        }

        for (int i = 0; i <old_user.size() ; i++) {
            if(!((old_user.get(i)).split(","))[i].equals(select_name)){
                new_user.add(old_user.get(i));
            }
        }

        FileWriter fw=new FileWriter("user.txt", false);
        PrintWriter write_user=new PrintWriter(fw);

        for (int i = 0; i <(new_user.size()-1) ; i++) {
            write_user.println(new_user.get(i));
        }
        write_user.print(new_user.get(new_user.size()-1));
        write_user.close();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("删除成功");
        alert.setContentText("已成功删除该用户！");
        alert.initStyle(TRANSPARENT);
        alert.show();
    }

    public void click_btn_close(){
        Stage stage = (Stage) tableview_show.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) tableview_show.getScene().getWindow();
        stage.setIconified(true);
    }

}
