package com.example.lab1_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.application.Platform;

public class PrimaryController {
    @FXML private Label l_info;
    @FXML private ImageView obrazek;

    // Zmiana koloru tekstu
    @FXML private void setBlue() { l_info.setTextFill(Color.BLUE); }
    @FXML private void setGreen() { l_info.setTextFill(Color.GREEN); }
    @FXML private void setRed() { l_info.setTextFill(Color.RED); }

    // Wyświetlanie wartości dla RadioButtonów 1, 2, 3
    @FXML private void setText1() { l_info.setText("=1"); }
    @FXML private void setText2() { l_info.setText("=2"); }
    @FXML private void setText3() { l_info.setText("=3"); }

    // Wyświetlanie obrazka
    @FXML private void showImage1() { obrazek.setImage(new Image(getClass().getResourceAsStream("/img/image1.jpg"))); }
    @FXML private void showImage2() { obrazek.setImage(new Image(getClass().getResourceAsStream("/img/image2.jpg"))); }
    @FXML private void showImage3() { obrazek.setImage(new Image(getClass().getResourceAsStream("/img/image3.jpg"))); }

    // Obsługa menu
    @FXML private void exitApp() { Platform.exit(); }
    @FXML private void showAbout() { l_info.setText("Aplikacja JavaFX - Laboratorium 2"); }
}