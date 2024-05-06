module org.example.musicmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.musicmanagement to javafx.fxml;
    exports org.example.musicmanagement;
}