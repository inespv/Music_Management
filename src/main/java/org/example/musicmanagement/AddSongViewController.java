package org.example.musicmanagement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import music.Song;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class AddSongViewController implements Initializable {
    public TableView<Song> musicTable;
    public TableColumn<Song,String> title;
    public TableColumn<Song,String> genre;
    public TableColumn<Song,String> album;
    public TableColumn<Song,String> artist;
    public TableColumn<Song,Integer> year;
    public AnchorPane titleText;
    public TableColumn<Song,Double> duration;
    public TextField titleTextBox;
    public TextField genreTextBox;
    public Button addButton;
    public TextField artistTextBox;
    public TextField yearTextBox;
    public TextField albumTextBox;
    public TextField durationTextBox;

    //we use an Observable list to update the list automatically
    //with a normal list we should do it manually;
    private ObservableList<Song> songs;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //every property value factory refers to the correspond
        // getter and setter we implemented in the Song class
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        album.setCellValueFactory(new PropertyValueFactory<>("album"));
        artist.setCellValueFactory(new PropertyValueFactory<>("artist"));
        year.setCellValueFactory(new PropertyValueFactory<>("year"));
        duration.setCellValueFactory(new PropertyValueFactory<>("duration"));

        songs = FXCollections.observableArrayList(
        new Song("get him back!" , "pop/rock" ,"Olivia Rodrigo",
                        2023 , "GUTS" , 3.31),

        new Song("pretty isn't pretty" , "pop/rock" ,"Olivia Rodrigo",
                2023 , "GUTS" , 3.19),

        new Song("bad idea right ?" , "pop/rock" ,"Olivia Rodrigo",
                2023 , "GUTS" , 3.04)
        );
        musicTable.setItems(songs);

        /*private List<Song> readfile(){
            try{
                return Files.lines(Paths.get("songs.txt"))
                        .map(line -> new Song(
                                line.split(",") [0],
                                line.split(",")[1],
                                line.split(",") [2],
                                Integer.parseInt(line.split(",")[3]),
                                line.split(",")[4] ,
                                Double.parseDouble(line.split(",")[5]))).collect(Collections.toList());
            }catch(Exception e){
                return null;
            }
        }*/
    }
}
