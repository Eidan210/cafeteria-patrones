package org.example;

import org.example.bebida.Bebida;
import org.example.bebida.Cafe;
import org.example.bebida.Canela;
import org.example.bebida.Leche;
import org.example.descuento.Descuento;
import org.example.descuento.DescuentoPorMonto;
import org.example.descuento.DescuentoPorcentaje;
import org.example.pedido.Pedido;

public class Main {
    public static void main(String[] args) {
        Bebida b = new Cafe();
        b = new Leche(b);
        b = new Canela(b);


        System.out.println(b.getDescripcion());
        System.out.println(b.getPrecio());

        System.out.println(" ");
        Descuento d = new DescuentoPorcentaje(10);
        System.out.println(d.aplicar(b.getPrecio()));

        System.out.println(" ");
        Descuento m = new DescuentoPorMonto(10000,2000);
        System.out.println(m.aplicar(12000));
        System.out.println(m.aplicar(8000));

        System.out.println(" ");
        Pedido p = new Pedido(1, b, new DescuentoPorcentaje(10));
        System.out.println(p.getTotal());
    }
}