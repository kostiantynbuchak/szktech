package com.example.lab_6;

import javafx.animation.RotateTransition;
import javafx.scene.control.Button;
import javafx.util.Duration;

public class Animacja {
    public static void dodajAnimacje(Button button) {
        RotateTransition obrót = new RotateTransition(Duration.seconds(3), button);
        obrót.setByAngle(720);
        obrót.setCycleCount(1);
        button.setOnAction(event -> obrót.play());
    }
}
