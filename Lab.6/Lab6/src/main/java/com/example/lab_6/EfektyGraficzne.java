package com.example.lab_6;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.control.Label;

public class Effects {
    public static void dodajEfekt(Label etykieta) {
        etykieta.setEffect(new DropShadow());  
        etykieta.setEffect(new Glow(0.6)); 
    }
}
