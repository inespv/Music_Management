module org.example.musicmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.musicmanagement to javafx.fxml;
    opens music;
    exports org.example.musicmanagement;
}