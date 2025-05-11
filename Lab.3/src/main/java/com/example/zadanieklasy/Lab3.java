package com.example.zadanieklasy;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab3 {
    public static void main(String[] args){
        /*! Utworzenie instancji obiektu Prostokat i przeprowadzenie testów metod*/
        Prostokat pros=new Prostokat(3,4.5);
        pros.info();
        System.out.println(pros.pole());
        pros.setA(5);
        pros.setB(6);
        System.out.println(pros.pole());
        /*! Utworzenie instancji obiektu Kolo i przeprowadzenie testów metod*/
        Kolo kol =new Kolo(5);
        kol.info();
        System.out.println(pros.pole());
        /*! Utworzenie kolekcji obiektów */
        var lista=new ArrayList<Figura>(Arrays.asList(
                new Prostokat(6,7),
                new Prostokat(20,30),
                new Prostokat(2,5),
                new Prostokat(10,50),
                new Kolo(9),
                new Kolo(7),
                new Kolo(2),
                new Kolo(10)
        ));
        /*! Wypisanie poglądowo kolekcji obiektów */
        for(var el:lista){
            el.info();
            System.out.println(el.pole());
        }
        System.out.println("Z podanej listy następujące obiekty spełniają warunek Pole<100");
        /*! Wypisanie obiektów z kolekcji spełniających warunek Pole<100 */
        for(var el:lista){
            if(el.pole()<100){
                el.info();
                System.out.println(el.pole());
            }
        }
    }
}