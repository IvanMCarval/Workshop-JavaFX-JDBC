module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx to javafx.fxml;
    opens com.example.javafx.gui to javafx.fxml;
    exports com.example.javafx;
    exports com.example.javafx.gui;
}