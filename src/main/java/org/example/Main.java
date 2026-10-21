package org.example;

import org.example.aviso.Cliente;
import org.example.aviso.PantallaAvisos;
import org.example.bebida.Bebida;
import org.example.bebida.Cafe;
import org.example.bebida.Leche;
import org.example.descuento.DescuentoPorcentaje;
import org.example.descuento.SinDescuento;
import org.example.pedido.Pedido;

public class Main {
    public static void main(String[] args) {
        Bebida b1 = new Cafe();
        Pedido p1 = new Pedido(1, b1, new SinDescuento());
        p1.agregarObservador(new Cliente("Ana"));

        System.out.println("--- Pedido 1 ---");
        System.out.println("Bebida: "+p1.getBebida().getDescripcion());
        System.out.println("Total: "+ p1.getTotal());
        p1.marcarListo();
        System.out.println(" \n");

        Bebida b2 = new Cafe();
        b2 = new Leche(b2);
        Pedido p2 = new Pedido(2, b2, new DescuentoPorcentaje(10));
        p2.agregarObservador(new Cliente("Luis"));
        p2.agregarObservador(new PantallaAvisos());


        System.out.println("--- Pedido 2 ---");
        System.out.println("Bebida: "+ p2.getBebida().getDescripcion());
        System.out.println("Total: "+ p2.getTotal());
        p2.marcarListo();
    }
}