package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class UserInfo implements Initializable {

    public TableView<book> tableview_show;
    public TableColumn table_name;
    public TableColumn table_num;
    public TableColumn table_type;
    public TableColumn table_press;
    public TableColumn table_writer;
    public TableColumn table_fre;
    public Label label_name;
    public Label label_num;
    public Label label_type;
    public Label label_press;
    public Label label_writer;
    public Label label_fre;

    public TextField text_contain;

    public ObservableList<book> data;
    public ArrayList<String> book_list=new ArrayList<>();
    public File book_file;
    public Scanner read_book;

    public  void  click_tableview()
    {
        book select_book= tableview_show.getSelectionModel().getSelectedItem();
        String select_name=select_book.getTable_name();
        String select_num=select_book.getTable_num();
        String select_type=select_book.getTable_type();
        String select_press=select_book.getTable_press();
        String select_writer=select_book.getTable_writer();
        String select_fre=select_book.getTable_fre();

        label_name.setText(select_name);
        label_num.setText(select_num);
        label_type.setText(select_type);
        label_press.setText(select_press);
        label_writer.setText(select_writer);
        label_fre.setText(select_fre);

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        text_contain.setText(Login.login_account);
        text_contain.setEditable(false);

        tableview_show.setEditable(false);
        book_file=new File("book.txt");
        try {
            read_book=new Scanner(book_file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (read_book.hasNext())
        {
            String str=read_book.next();
            book_list.add(str);
        }
        read_book.close();
    }


    public void click_btn_search()
    {
        if(!(text_contain.getText().isEmpty()) )
        {
            String input_text=text_contain.getText();
            ArrayList<book> right_book=new ArrayList<>();
            for(int i=0;i<book_list.size();i++) {
                String book_user = ((book_list.get(i)).split(","))[6];
                if(book_user.equals(input_text))
                {
                    right_book.add(new book(book_list.get(i)));
                }
            }
            data = FXCollections.observableArrayList(right_book);
            dataBind(data);
        }
    }


    private void dataBind(ObservableList<book> list)
    {
        table_name.setCellValueFactory(new PropertyValueFactory<>("table_name"));
        table_num.setCellValueFactory(new PropertyValueFactory("table_num"));
        table_press.setCellValueFactory(new PropertyValueFactory("table_press"));
        table_writer.setCellValueFactory(new PropertyValueFactory("table_writer"));
        table_type.setCellValueFactory(new PropertyValueFactory("table_type"));
        table_fre.setCellValueFactory(new PropertyValueFactory("table_fre"));
        tableview_show.setItems(list);
    }

    public void click_btn_close(){
        Stage stage = (Stage) label_name.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min(){
        Stage stage = (Stage) label_name.getScene().getWindow();
        stage.setIconified(true);
    }
}
