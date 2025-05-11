/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.edu.wsiz.lab3;

/**
 *
 * @author lg
 */
public class Osoba {
    private String imie = null;
    private String nazwisko = null;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }    
    
    public String getNazwisko(){
        return nazwisko;
    }
    
    public void setNazwisko(String nazwisko){
        this.nazwisko=nazwisko;
    }
}
