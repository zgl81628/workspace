package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javafx.stage.StageStyle.TRANSPARENT;


public class AddBook {
    public TextField text_name;
    public TextField text_num;
    public TextField text_type;
    public TextField text_press;
    public TextField text_writer;
    public Button btn_ok;
    public Button btn_clear;
    public TableView<book> tableview_show;
    public TableColumn table_name;
    public TableColumn table_num;
    public TableColumn table_type;
    public TableColumn table_press;
    public TableColumn table_writer;

    public ObservableList<book> data;
    public ArrayList<book> add_book=new ArrayList<>();

    public void click_btn_ok() throws IOException {
        File book_file=new File("book.txt");
        Scanner read_book =new Scanner(book_file);

        FileWriter fw=new FileWriter("book.txt", true);
        PrintWriter write_book=new PrintWriter(fw);

        String book_name=text_name.getText();
        String book_num=text_num.getText();
        String book_type=text_type.getText();
        String book_press=text_press.getText();
        String book_writer=text_writer.getText();
        String new_book=book_name+","+book_num+","+book_type+","+book_press+","+book_writer+","
                        +"在馆"+","+"未被借出"+","+"0";
        ArrayList<String> book_list=new ArrayList<>();
        while(read_book.hasNext())
        {
            String book=read_book.nextLine();
            book_list.add(book);
        }
        read_book.close();

        boolean is_full=false;
        if((book_name.length()!=0)&&(book_num.length()!=0)&&(book_type.length()!=0)&&(book_press.length()!=0)&&(book_writer.length()!=0)) {
            is_full=true;
        }
        if (is_full) {
            for (int i = 0; i < (book_list).size(); i++) {
                String num = ((book_list.get(i)).split(","))[1];
                if(num.equals(book_num))
                {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error Dialog");
                    alert.setHeaderText("添加失败");
                    alert.setContentText("该书籍已存在！");
                    alert.initStyle(TRANSPARENT);
                    alert.show();
                    break;
                }
                else{
                    if(i==(book_list.size()-1)){
                        add_book.add(new book(new_book));
                        write_book.print("\n");
                        write_book.print(new_book);
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("消息");
                        alert.setHeaderText("添加成功");
                        alert.setContentText(book_name+" 已成功添加！");
                        alert.initStyle(TRANSPARENT);
                        alert.show();
                        break;
                    }

                }
            }
        }
        else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Dialog");
            alert.setHeaderText("错误");
            alert.setContentText("请不要输入空白！");
            alert.initStyle(TRANSPARENT);
            alert.show();
        }

        click_btn_clear();
        write_book.close();
        data = FXCollections.observableArrayList(add_book);
        dataBind(data);

}

    public  void dataBind(ObservableList<book> list){
        table_name.setCellValueFactory(new PropertyValueFactory("table_name"));
        table_num.setCellValueFactory(new PropertyValueFactory("table_num"));
        table_press.setCellValueFactory(new PropertyValueFactory("table_press"));
        table_writer.setCellValueFactory(new PropertyValueFactory("table_writer"));
        table_type.setCellValueFactory(new PropertyValueFactory("table_type"));
        tableview_show.setItems(list);
    }

    public void click_btn_clear(){
        text_name.setText("");
        text_num.setText("");
        text_type.setText("");
        text_press.setText("");
        text_writer.setText("");
    }


    public void click_btn_close(){
        Stage stage = (Stage) text_num.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) text_num.getScene().getWindow();
        stage.setIconified(true);
    }

}
