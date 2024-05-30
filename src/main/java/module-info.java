module org.example.musicmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens org.example.musicmanagement to javafx.fxml;
    opens music;
    exports org.example.musicmanagement;
}