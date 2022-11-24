package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Cat cat = new Cat("Grizabella", "white", 29);
        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));
        output(cat.getAge());
        output(cat.getAge());
        output(cat.getAge());
        output(cat.getAge());
    
        output("------------------------");

        TomCat tomCat = new TomCat("Alonzo", "grey", 35);
        output(tomCat.getStringAttributes("#name"));
        output(tomCat.getStringAttributes("#color"));
        output(tomCat.getAge());

    }

    // Methode wird aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

