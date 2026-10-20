package org.example.pedido;

import org.example.bebida.Bebida;
import org.example.descuento.Descuento;

public class Pedido {

    private final int numero;
    private final Bebida bebida;
    private final Descuento descuento;

    public Pedido (int numero, Bebida bebida, Descuento descuento) {
        this.numero = numero;
        this.bebida = bebida;
        this.descuento = descuento;
    }

    public int getTotal() {
        return descuento.aplicar(bebida.getPrecio());
    }

    public int getNumero() {
        return numero;
    }

    public Bebida getBebida() {
        return bebida;
    }
}
