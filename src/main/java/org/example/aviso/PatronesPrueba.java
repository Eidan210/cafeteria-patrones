package org.example;

import org.example.aviso.Cliente;
import org.example.aviso.PantallaAvisos;
import org.example.bebida.Bebida;
import org.example.bebida.Cafe;
import org.example.bebida.Canela;
import org.example.bebida.Leche;
import org.example.descuento.Descuento;
import org.example.descuento.DescuentoPorMonto;
import org.example.descuento.DescuentoPorcentaje;
import org.example.pedido.Pedido;

public class PatronesPrueba {
    public static void main(String[] args) {

        // Prueba 1 - Decorator: Café + Leche + Canela (esperado: 3800)
        Bebida b = new Cafe();
        b = new Leche(b);
        b = new Canela(b);

        System.out.println(b.getDescripcion());
        System.out.println(b.getPrecio());

        // Prueba 2 - Strategy: 10 % de descuento (esperado: 3420)
        System.out.println(" ");
        Descuento d = new DescuentoPorcentaje(10);
        System.out.println(d.aplicar(b.getPrecio()));

        // Prueba 3 - Strategy: descuento por monto (esperado: 10000 y 8000)
        System.out.println(" ");
        Descuento m = new DescuentoPorMonto(10000, 2000);
        System.out.println(m.aplicar(12000));
        System.out.println(m.aplicar(8000));

        // Prueba 4 - Pedido: bebida + descuento (esperado: 3420)
        System.out.println(" ");
        Pedido p = new Pedido(1, b, new DescuentoPorcentaje(10));
        System.out.println(p.getTotal());

        // Prueba 5 - Observer: avisar a cliente y pantalla (esperado: 2 mensajes)
        Pedido pd = new Pedido(1, b, new DescuentoPorcentaje(10));
        pd.agregarObservador(new Cliente("Ana"));
        pd.agregarObservador(new PantallaAvisos());

        pd.marcarListo();
    }
}