package com.example.lab_6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Label etykieta = new Label("Appka LAB6!");
        etykieta.setId("etykietaStyl"); 

        Button przycisk1 = new Button("Przycisk 1");
        Button przycisk2 = new Button("Przycisk 2");
        Button przycisk3 = new Button("Przycisk 3");

        przycisk1.setId("przycisk11");
        przycisk2.setStyle("-fx-background-color: green; -fx-text-fill: white;"); 
        Effects.dodajEfekt(etykieta); 
        Animacja.dodajAnimacje(przycisk3);
        // w68136
        VBox root = new VBox(10, etykieta, przycisk1, przycisk2, przycisk3);
        root.getStylesheets().add(getClass().getResource("Stylizacja.css").toExternalForm());

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Stylizacja JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
