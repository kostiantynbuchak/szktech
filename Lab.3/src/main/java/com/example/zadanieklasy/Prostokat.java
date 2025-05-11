package com.example.zadanieklasy;
/*! klasa Prostokat implementuje interfejs Figura */
public class Prostokat implements Figura{
    protected double a;//! Pole symbolizujące pierwszy bok prostokątu
    protected double b;//! Pole symbolizujące drugi bok prostokątu

    //! Konstruktor klasy Prostokat przyjmujący dwie wartości
    public Prostokat(double a,double b){
        this.a=a;
        this.b=b;
    }
    //! Settery i gettery dal pól klasy
    public void setA (double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }
    public void setB (double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    //! Nadpisana metoda info pochodząca z interfejsu wypisująca informacje o bokach prostokąta
    @Override
    public void info(){
        System.out.println("Wartość boku A wynosi: "+getA()+" Wartość boku B wynosi: "+getB());
    }
    //! Nadpisana metoda pole pochodząca z interfejsu zwracająca pole prostokąta
    @Override
    public double pole(){
        return a*b;
    }
}
