package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class BookListCont {

    public TableView<Book_new> tableView;                                                   //表格
    public TableColumn<Book_new, Integer> rankColumn;                                       //排名
    public TableColumn<Book_new, String> nameColumn;                                        //书名
    public TableColumn<Book_new, String> pressColumn;                                       //出版社
    public TableColumn<Book_new, String> writerColumn;                                      //作者
    public TableColumn<Book_new, Integer> freColumn;
    public ImageView adImage1;
    private ObservableList<Book_new> bookList = FXCollections.observableArrayList();        //存放所有书籍
    private ObservableList<Book_new> bookListSorted = FXCollections.observableArrayList();  //存放已排序的前十位书单
    private ArrayList<File> adImageFileList = new ArrayList<File>();
    private int adImageNum = 0;

    public BookListCont() throws Exception {
        System.out.println("new a BookListWin!");
        setList();
    }

    //设置排行榜
    public void setList() throws FileNotFoundException {
        String oneBookLine;
        try {
            File bookListFile = new File("book.txt");
            Scanner input = new Scanner(bookListFile);
            while (input.hasNextLine()) {
                oneBookLine = input.nextLine();
                //初始化一本书，并读入info
                Book_new book = verifyABook(oneBookLine);
                bookList.add(book);
            }

            ascendingSort();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //初始化一本书，并读入info
    public Book_new verifyABook(String oneBookLine) throws ParseException {
        System.out.println("now verify " + oneBookLine);
        ArrayList<String> info = new ArrayList<String>();
        while (oneBookLine != null) {
            int length = oneBookLine.length();
            int indexOfComma = oneBookLine.indexOf(",");
            if (indexOfComma == -1) {
                String subInfo = oneBookLine;
                info.add(subInfo);
                oneBookLine = null;
            } else {
                String subInfo = oneBookLine.substring(0, indexOfComma);
                info.add(subInfo);
                oneBookLine = oneBookLine.substring(indexOfComma + 1, length);
            }
        }
        System.out.println("finish a book");

        Book_new book = null;
        System.out.println("info.size() == " + info.size());
        if (info.size() == 8) {
            book = new Book_new(info.get(0), info.get(1), info.get(2), info.get(3), info.get(4), info.get(5), info.get(6), info.get(7));
        }

        return book;
    }

    public void ascendingSort() {
        int biggestFre = -1, biggestIndex = -1, rank = 1;
        for (int time = 0; time < 10; time++) {
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("before the if :bookList.get(i).getBookRank() == " + bookList.get(i).getBookRank());
                if (bookList.get(i).getBookRank() == 0 && bookList.get(i).getBookFre() > biggestFre) {
                    System.out.println("bookList.get(i).getBookRank() == " + bookList.get(i).getBookRank()
                            + " bookList.get(i).getBookFre() == " + bookList.get(i).getBookFre());
                    biggestFre = bookList.get(i).getBookFre();
                    biggestIndex = i;
                }
            }

            System.out.println("biggestIndex == " + biggestIndex + " biggestFre == " + biggestFre);
            bookList.get(biggestIndex).setBookRank(rank);
            bookListSorted.add(bookList.get(biggestIndex));

            biggestFre = -1;
            rank++;
        }
    }

    /**
     * 在fxml文件完成载入时自动被调用
     */
    @FXML
    public void initialize() throws IOException {
        System.out.println("now initialize");

        rankColumn.setCellValueFactory(
                new PropertyValueFactory<>("bookRank"));
        nameColumn.setCellValueFactory(
                new PropertyValueFactory<>("bookName"));
        pressColumn.setCellValueFactory(
                new PropertyValueFactory<>("bookPress"));
        writerColumn.setCellValueFactory(
                new PropertyValueFactory<>("bookWriter"));
        freColumn.setCellValueFactory(
                new PropertyValueFactory<>("bookFre"));

       //绑定数据到TableView
        tableView.setItems(bookListSorted);
        File imageFile = new File("pic/images/0.png");
        Image image1 = new Image(this.getClass().getResourceAsStream("pic/images/0.png"));
       // Image image1 = new Image(imageFile.toURI().toString());
        adImage1.setImage(image1);
        //这里进行adImageList初始化，任何需要展示的图片文件都放在这里！
        initializeAdImageFileList();
    }

  public void initializeAdImageFileList() {
        for (int i = 0; i < 6; i++) {
            File file = new File("pic/images/" + i + ".png");
            adImageFileList.add(file);
        }
        System.out.println("adImageFileList.size() == " + adImageFileList.size());
    }

    public void changeImage(MouseEvent mouseEvent) throws IOException {
        System.out.println("now change image" + adImage1.getImage().toString());

        for (int i = 0; i < adImageFileList.size(); i++) {
            if (adImageNum == i) {
                if (i < (adImageFileList.size() - 1)) {
                    //adImage1.setImage(new Image(adImageFileList.get(i + 1).toURI().toString()));
                    adImage1.setImage(new Image(this.getClass().getResourceAsStream("pic/images/"+(i+1)+".png")));
                    //Image image1 = new Image(this.getClass().getResourceAsStream("pic/images/0.png"));
                    adImageNum++;
                } else {
                    adImage1.setImage(new Image(this.getClass().getResourceAsStream("pic/images/0.png")));
                    adImageNum = 0;
                }
                break;
            }
        }

    }

    public void click_btn_close() {
        Stage stage = (Stage) tableView.getScene().getWindow();
        stage.close();
    }

    public void click_btn_min() {
        Stage stage = (Stage) tableView.getScene().getWindow();
        stage.setIconified(true);
    }
}



