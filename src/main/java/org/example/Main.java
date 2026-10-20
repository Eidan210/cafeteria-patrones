package org.example;

import org.example.bebida.Bebida;
import org.example.bebida.Cafe;
import org.example.bebida.Canela;
import org.example.bebida.Leche;

public class Main {
    public static void main(String[] args) {
        Bebida b = new Cafe();
        b = new Leche(b);
        b = new Canela(b);

        System.out.println(b.getDescripcion());
        System.out.println(b.getPrecio());
    }
}