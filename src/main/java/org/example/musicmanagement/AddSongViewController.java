package org.example.musicmanagement;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import music.Song;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

/**
 * Class to control the method Add Song
 */
public class AddSongViewController implements Initializable {
    @FXML
    private TableView<Song> musicTable;
    @FXML
    private TableColumn<Song, String> title;
    @FXML
    private TableColumn<Song, String> genre;
    @FXML
    private TableColumn<Song, String> album;
    @FXML
    private TableColumn<Song, String> artist;
    @FXML
    private TableColumn<Song, Integer> year;
    @FXML
    private AnchorPane titleText;
    @FXML
    private TableColumn<Song, Double> duration;
    @FXML
    private TextField titleTextBox;
    @FXML
    private TextField genreTextBox;
    @FXML
    private Button addButton;
    @FXML
    private TextField artistTextBox;
    @FXML
    private TextField yearTextBox;
    @FXML
    private TextField albumTextBox;
    @FXML
    private TextField durationTextBox;

    /**
     * Method that initializes Song class attributes
     *
     * @param url
     * @param resourceBundle
     */

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

        //we use an Observable list to update the list automatically
        //with a normal list we should do it manually;
        songs = FXCollections.observableArrayList(readFile());
        musicTable.setItems(songs);

    }
    private List<Song> readFile()
    {
        try
        {
            return Files.lines(Paths.get("songs.txt"))
                    .map(line -> new Song(line.split(":")[0],
                            line.split(":")[1],
                            line.split(":")[2],
                            Integer.parseInt(line.split(":")[3]),
                            line.split(":")[4],
                            Double.parseDouble(line.split(":")[5]))).collect(Collectors.toList());
        }
        catch (Exception e) {
            return null;
        }
    }
    private void saveFile(List<Song> songs )
    {
        try(PrintWriter pw = new PrintWriter("songs.txt"))
        {
            songs.stream().forEach(s -> pw.println(s.toString()));
        }catch (FileNotFoundException f ){
            System.err.println("File not found ");
            f.getMessage();
        }
    }

    public void addSong(ActionEvent actionEvent) {
        if(titleTextBox.getText().equals(" ") ||
        genreTextBox.getText().equals(" ")   ||
                artistTextBox.getText().equals(" ") ||
                yearTextBox.getLength() > 4 ||
                yearTextBox.getLength() < 4 ||
                albumTextBox.getText().equals(" ") ||
                durationTextBox.getLength() > 4 ||
                durationTextBox.getLength() < 4 )
        {
            Alert dialog = new Alert(Alert.AlertType.ERROR);
            dialog.setTitle("Error");
            dialog.setContentText("THis field cannot be empty");
            dialog.showAndWait();
        }
        else{
            songs.add(new Song(titleTextBox.getText(),genreTextBox.getText(),artistTextBox.getText(),
                    Integer.parseInt(yearTextBox.getText()),albumTextBox.getText(),
                    Double.parseDouble(durationTextBox.getText())));

            saveFile(songs);
        }
    }
}
