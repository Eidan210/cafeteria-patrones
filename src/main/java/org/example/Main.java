package org.example;

import org.example.aviso.Cliente;
import org.example.aviso.PantallaAvisos;
import org.example.bebida.*;
import org.example.descuento.DescuentoPorMonto;
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
        System.out.println(" \n");

        Bebida b3 = new Cafe();
        b3 = new Leche(new ShotExtra(new ShotExtra(b3)));
        Pedido p3 = new Pedido(3, b3, new DescuentoPorMonto(5000,1000));
        p3.agregarObservador(new Cliente("Marta"));
        p3.agregarObservador(new PantallaAvisos());

        System.out.println("--- Pedido 3 ---");
        System.out.println("Bebida: "+ p3.getBebida().getDescripcion());
        System.out.println("Total: "+ p3.getTotal());
        p3.marcarListo();
        System.out.println(" \n");

        Bebida b4 = new Cafe();
        b4 = new Canela(new ShotExtra(b4));
        Pedido p4 = new Pedido(4, b4, new DescuentoPorMonto(5000,1000));
        p4.agregarObservador(new PantallaAvisos());

        System.out.println("--- Pedido 4 ---");
        System.out.println("Bebida: "+ p4.getBebida().getDescripcion());
        System.out.println("Total: "+ p4.getTotal());
        p4.marcarListo();
        System.out.println(" \n");

        Bebida b5 = new Cafe();
        b5 = new Leche(new Canela(new ShotExtra(b5)));
        Pedido p5 = new Pedido(5,b5,new DescuentoPorcentaje(20));
        p5.agregarObservador(new Cliente("Pedro"));
        p5.agregarObservador(new PantallaAvisos());

        System.out.println("--- Pedido 5 ---");
        System.out.println("Bebida: "+ p5.getBebida().getDescripcion());
        System.out.println("Total: "+ p5.getTotal());
        p5.marcarListo();
    }
}