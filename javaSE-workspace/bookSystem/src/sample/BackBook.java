package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

import static javafx.stage.StageStyle.TRANSPARENT;

public class BackBook implements Initializable {
    public TableView tableview_show;
    public TableColumn table_name;
    public TableColumn table_num;
    public TableColumn table_press;
    public TableColumn table_type;
    public TableColumn table_writer;
    public TextField text_num;
    public TextField text_user;

    public ObservableList<bookAdmin> data;
    public ArrayList<bookAdmin> show_list=new ArrayList<>();

    public void click_btn_back() throws IOException {
        String book_num=text_num.getText();
        String user_num=text_user.getText();
        ObservableList<bookAdmin> data;
        ArrayList<String> book_list=new ArrayList<>();
        ArrayList<String> name_list=new ArrayList<>();
        ArrayList<String> num_list=new ArrayList<>();
        ArrayList<String> type_list=new ArrayList<>();
        ArrayList<String> press_list=new ArrayList<>();
        ArrayList<String> writer_list=new ArrayList<>();
        ArrayList<String> isOut_list=new ArrayList<>();
        ArrayList<String> lentTo_list=new ArrayList<>();
        ArrayList<String> fre_list=new ArrayList<>();

        ArrayList<String> user_list=new ArrayList<>();
        ArrayList<String> usernum_list=new ArrayList<>();
        ArrayList<String> password_list=new ArrayList<>();
        ArrayList<String> userbook_list=new ArrayList<>();
        ArrayList<String> email_list=new ArrayList<>();

        ArrayList<String> write_list=new ArrayList<>();
        ArrayList<String> write_user_list=new ArrayList<>();

        File book_file =new File("book.txt");
        Scanner read_book=new Scanner(book_file);
        File user_file =new File("user.txt");
        Scanner read_user=new Scanner(user_file);

        while (read_book.hasNext()){
            String str=read_book.nextLine();
            book_list.add(str);
            name_list.add(str.split(",")[0]);
            num_list.add(str.split(",")[1]);
            type_list.add(str.split(",")[2]);
            press_list.add(str.split(",")[3]);
            writer_list.add(str.split(",")[4]);
            isOut_list.add(str.split(",")[5]);
            lentTo_list.add(str.split(",")[6]);
            fre_list.add(str.split(",")[7]);
        }
        while (read_user.hasNext()){
            String str=read_user.nextLine();
            user_list.add(str);
            usernum_list.add(str.split(",")[0]);
            password_list.add(str.split(",")[1]);
            userbook_list.add(str.split(",")[2]);
            email_list.add(str.split(",")[3]);
        }
        boolean is_success=false;
        for (int i = 0; i <num_list.size(); i++) {
            if(book_num.equals(num_list.get(i))&&((lentTo_list.get(i)).equals(user_num))){
                String newInfo=name_list.get(i)+","+num_list.get(i)+","+type_list.get(i)+","+
                        press_list.get(i)+","+writer_list.get(i)+","+"在馆"+","+"未被借出"+","+
                        fre_list.get(i);
                write_list.add(newInfo);
                show_list.add(new bookAdmin(book_list.get(i)));
                is_success=true;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("成功");
                alert.setHeaderText("还书成功");
                alert.setContentText(name_list.get(i)+"已成功归还！");
                alert.initStyle(TRANSPARENT);
                alert.show();
                text_num.setText("");
            }
            else {
                write_list.add(book_list.get(i));
            }
        }
        if(!is_success){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("失败");
            alert.setHeaderText("还书失败");
            alert.setContentText("请输入正确的信息！");
            alert.initStyle(TRANSPARENT);
            alert.show();
            text_num.setText("");
        }

        for (int i = 0; i <user_list.size(); i++) {
            if (user_num.equals(usernum_list.get(i))&&is_success)
            {
                String newInfo;
                ArrayList<String> userbook= new ArrayList<>(Arrays.asList((userbook_list.get(i)).split("\\+")));
                String new_book="";
                if(userbook.size()==1) {
                    newInfo = user_num + "," + password_list.get(i) + "," + "无"+ "," + email_list.get(i);
                }
                else{
                    for (int j = 0; j <userbook.size() ; j++) {
                        if(!((userbook.get(j)).equals(book_num))) {
                           if(new_book.equals("")){
                               new_book=userbook.get(j);
                           }
                           else {
                               new_book=new_book+"+"+userbook.get(j);
                           }
                        }
                    }
                    newInfo = user_num + "," + password_list.get(i) + "," + new_book
                            + "," + email_list.get(i);
                }

                write_user_list.add(newInfo);
            }
            else {
                write_user_list.add(user_list.get(i));
            }
        }

        FileWriter fw=new FileWriter("book.txt", false);
        PrintWriter write_book=new PrintWriter(fw);
        for (int i = 0; i <(write_list.size()-1) ; i++) {
            write_book.println(write_list.get(i));
        }
        write_book.print(write_list.get(write_list.size()-1));
        write_book.close();

        FileWriter fw1=new FileWriter("user.txt", false);
        PrintWriter write_user=new PrintWriter(fw1);
        for (int i = 0; i <(write_user_list.size()-1) ; i++) {
            write_user.println(write_user_list.get(i));
        }
        write_user.print(write_user_list.get(write_user_list.size()-1));
        write_user.close();


        data = FXCollections.observableArrayList(show_list);
        dataBind(data);

    }

    public void dataBind(ObservableList<bookAdmin> list){
        table_name.setCellValueFactory(new PropertyValueFactory("table_name"));
        table_num.setCellValueFactory(new PropertyValueFactory("table_num"));
        table_press.setCellValueFactory(new PropertyValueFactory("table_press"));
        table_writer.setCellValueFactory(new PropertyValueFactory("table_writer"));
        table_type.setCellValueFactory(new PropertyValueFactory("table_type"));
        tableview_show.setItems(list);
    }


    public void click_btn_close(){
        Stage stage = (Stage) text_num.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) text_num.getScene().getWindow();
        stage.setIconified(true);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        text_user.setText(Login.login_account);
        text_user.setEditable(false);
    }
}
