package com.example.lab_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField num1Field, num2Field, inputField;
    @FXML
    private Label calcresultlabel;
    @FXML
    private Label countresultlabel;
    @FXML
    private void handleAdd(){
        calculate("+");
    }
    @FXML
    private void handleSubstract(){
        calculate("-");
    }
    @FXML
    private void handleMultiply(){
        calculate("x");
    }
    @FXML
    private void handleDivide(){
        calculate("/");
    }
    @FXML
    private void calculate (String operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = switch (operation) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "x" -> num1 * num2;
                case "/" -> num2 != 0 ? num1 / num2 : 0;
                default -> 0;
            };
            calcresultlabel.setText("Wynik: " + result);
        } catch (NumberFormatException e) {
            calcresultlabel.setText("Bląd: wprowadź tylko liczby!");
        }
    }
    @FXML
    private void handleOblicz(){
        String text = inputField.getText();
        int charCount = text.length();
        int wordCount = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
        countresultlabel.setText("Znaki: "+charCount + ", Słowa: " + wordCount);
    }
}