module pl.edu.wsiz.lab3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens pl.edu.wsiz.lab3 to javafx.fxml;
    exports pl.edu.wsiz.lab3;
}
