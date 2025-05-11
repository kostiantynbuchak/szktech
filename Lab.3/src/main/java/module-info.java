module com.example.zadanieklasy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zadanieklasy to javafx.fxml;
    exports com.example.zadanieklasy;
}