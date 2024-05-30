package org.example.musicmanagement;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * Class to control the method Add Album
 */
public class AddAlbumController {
    public TableView musicTable;
    public TableColumn title;
    public TableColumn genre;
    public TableColumn duration;
    public TextField genreTextBox;
    public TextField titleTextBox;
    public AnchorPane titleText;
    public TableColumn artist;
    public TableColumn year;
    public Button addButtonAlbum;
    public TextField yearTextBox;
    public TextField artistTextBox;
    public TextField durationTextBox;
}
