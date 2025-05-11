package com.example.zadanieklasy;
/*! klasa Kolo implementuje interfejs Figura */
public class Kolo implements Figura{
    protected double r;//! Pole symbolizujące promień okręgu
    //! Konstruktor klasy Kolo przyjmujący jedną wartość
    public Kolo(double r){
        this.r=r;
    }
    //! Settery i gettery dal pól klasy
    public void setR (double r){
        this.r=r;
    }
    public double getR(){
        return r;
    }
    //! Nadpisana metoda info pochodząca z interfejsu wypisująca informacje o promieniu
    @Override
    public void info(){
        System.out.println("Promień wynosi: "+getR());
    }
    //! Nadpisana metoda pole pochodząca z interfejsu zwracająca pole koła
    @Override
    public double pole(){
        return 3.14*(r*r);
    }
}
