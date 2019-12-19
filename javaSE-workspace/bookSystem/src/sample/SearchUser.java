package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.net.URL;
import java.util.*;
import java.io.*;

public class SearchUser implements Initializable{

    public TableView<book> tableview_show;
    public TableColumn table_name;
    public TableColumn table_num;
    public TableColumn table_type;
    public TableColumn table_press;
    public TableColumn table_writer;
    public TableColumn table_isOut;
    public TableColumn table_fre;
    public Label label_name;
    public Label label_num;
    public Label label_type;
    public Label label_press;
    public Label label_writer;
    public Label label_isOut;
    public Label label_fre;

    public ComboBox<String> select_box;
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
        String select_isOut=select_book.getTable_isOut();
        String select_fre=select_book.getTable_fre();

        label_name.setText(select_name);
        label_num.setText(select_num);
        label_type.setText(select_type);
        label_press.setText(select_press);
        label_writer.setText(select_writer);
        label_isOut.setText(select_isOut);
        label_fre.setText(select_fre);

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        select_box.getItems().add("按名称搜索");
        select_box.getItems().add("按编号搜索");
        select_box.getItems().add("按类别搜索");
        select_box.getItems().add("按作者搜索");
        select_box.getItems().add("按出版社搜索");
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

    public int choice_kind()
    {
        String str_kind = (String) select_box.getValue();
        if(str_kind.equals("按名称搜索"))
        {
            return 1;
        }
        else if (str_kind.equals("按编号搜索"))
        {
            return 2;
        }
        else if (str_kind.equals("按类别搜索"))
        {
            return 3;
        }
        else if (str_kind.equals("按作者搜索"))
        {
            return 4;
        }
        else
        {
            return 5;
        }
    }

    public void click_btn_search()
    {
        label_name.setText("");
        label_num.setText("");
        label_type.setText("");
        label_press.setText("");
        label_writer.setText("");
        label_isOut.setText("");
        label_fre.setText("");


      if(!(text_contain.getText().isEmpty()) )
      {
          int search_kind = this.choice_kind();
          switch (search_kind) {
              case 1: {
                  search_name();
                  break;
              }
              case 2: {
                  search_num();
                  break;
              }
              case 3: {
                  search_type();
                  break;
              }
              case 4: {
                  search_writer();
                  break;
              }
              case 5: {
                  search_press();
                  break;
              }
          }
      }
    }


    public void search_name(){
        String input_text=text_contain.getText();
        ArrayList<book> right_book=new ArrayList<>();
        for(int i=0;i<book_list.size();i++) {
            String book_name = ((book_list.get(i)).split(","))[0];
            if(book_name.contains(input_text))
            {
                right_book.add(new book(book_list.get(i)));
            }
        }
        data = FXCollections.observableArrayList(right_book);
        dataBind(data);
    }

    public void search_num(){
        String input_text=text_contain.getText();
        ArrayList<book> right_book=new ArrayList<>();
        for(int i=0;i<book_list.size();i++) {
            String book_num = ((book_list.get(i)).split(","))[1];
            if(book_num.equals(input_text))
            {
                right_book.add(new book(book_list.get(i)));
            }
        }
        data = FXCollections.observableArrayList(right_book);
        dataBind(data);

    }
    public void search_type(){
        String input_text=text_contain.getText();
        ArrayList<book> right_book=new ArrayList<>();
        for(int i=0;i<book_list.size();i++) {
            String book_name = ((book_list.get(i)).split(","))[2];
            if(book_name.contains(input_text))
            {
                right_book.add(new book(book_list.get(i)));
            }
        }
        data = FXCollections.observableArrayList(right_book);
        dataBind(data);

    }

    public void search_press(){
        String input_text=text_contain.getText();
        ArrayList<book> right_book=new ArrayList<>();
        for(int i=0;i<book_list.size();i++) {
            String book_name = ((book_list.get(i)).split(","))[3];
            if(book_name.contains(input_text))
            {
                right_book.add(new book(book_list.get(i)));
            }
        }
        data = FXCollections.observableArrayList(right_book);
        dataBind(data);

    }
    public void search_writer(){
        String input_text=text_contain.getText();
        ArrayList<book> right_book=new ArrayList<>();
        for(int i=0;i<book_list.size();i++) {
            String book_name = ((book_list.get(i)).split(","))[4];
            if(book_name.contains(input_text))
            {
                right_book.add(new book(book_list.get(i)));
            }
        }
        data = FXCollections.observableArrayList(right_book);
        dataBind(data);
    }

    private void dataBind(ObservableList<book> list)
    {
        table_name.setCellValueFactory(new PropertyValueFactory<>("table_name"));
        table_num.setCellValueFactory(new PropertyValueFactory("table_num"));
        table_press.setCellValueFactory(new PropertyValueFactory("table_press"));
        table_writer.setCellValueFactory(new PropertyValueFactory("table_writer"));
        table_type.setCellValueFactory(new PropertyValueFactory("table_type"));
        table_isOut.setCellValueFactory(new PropertyValueFactory("table_isOut"));
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
