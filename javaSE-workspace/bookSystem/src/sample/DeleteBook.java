package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javafx.stage.StageStyle.TRANSPARENT;

public class DeleteBook {
    public TextField text_delete;
    public TableView tableview_delete;
    public TableColumn table_name;
    public TableColumn table_num;
    public TableColumn table_type;
    public TableColumn table_press;
    public TableColumn table_writer;


    public ObservableList<book> data;
    public ArrayList<book> show_book=new ArrayList<>();

    //FileWriter fw=new FileWriter("book.txt", true);
    //PrintWriter write_book=new PrintWriter(fw);


    public void click_btn_delete() throws IOException {
        File book_file=new File("book.txt");
        Scanner read_book =new Scanner(book_file);
        ArrayList<String> delete_book=new ArrayList<>();
        ArrayList<String> new_book=new ArrayList<>();
        while(read_book.hasNext()){
            String str=read_book.nextLine();
            delete_book.add(str);
        }
        String text_str=text_delete.getText();
        for (int i = 0; i < (delete_book.size()) ; i++) {
            if(!(((delete_book.get(i)).split(",")[1]).equals(text_str))||(((delete_book.get(i)).split(",")[5]).equals("借出"))){
                new_book.add(delete_book.get(i));
            }
            else {
                show_book.add( new book(delete_book.get(i)));
            }
        }

        if(new_book.size()==delete_book.size()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("删除失败");
            alert.setHeaderText("删除失败");
            alert.setContentText("不存在该编号的书籍！");
            alert.initStyle(TRANSPARENT);
            alert.show();
        }
        else{
            FileWriter fw=new FileWriter("book.txt", false);
            PrintWriter write_book=new PrintWriter(fw);
            for (int i = 0; i <(new_book.size()-1) ; i++) {
                write_book.println(new_book.get(i));
            }
            write_book.print(new_book.get(new_book.size()-1));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("删除成功");
            alert.setHeaderText("删除成功");
            alert.setContentText("已成功删除该编号书籍！");
            alert.initStyle(TRANSPARENT);
            alert.show();
            data=FXCollections.observableArrayList(show_book);
            dataBind(data);
            write_book.close();
        }
        text_delete.setText("");

    }
    public  void dataBind(ObservableList<book> list){
        table_name.setCellValueFactory(new PropertyValueFactory("table_name"));
        table_num.setCellValueFactory(new PropertyValueFactory("table_num"));
        table_press.setCellValueFactory(new PropertyValueFactory("table_press"));
        table_writer.setCellValueFactory(new PropertyValueFactory("table_writer"));
        table_type.setCellValueFactory(new PropertyValueFactory("table_type"));
        tableview_delete.setItems(list);
  }

    public void click_btn_close(){
        Stage stage = (Stage) text_delete.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) text_delete.getScene().getWindow();
        stage.setIconified(true);
    }
}


