package org.example.pedido;

import org.example.bebida.Bebida;
import org.example.descuento.Descuento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final int numero;
    private final Bebida bebida;
    private final Descuento descuento;
    private final List<PedidoListoObserver> observadores = new ArrayList<>();

    public Pedido (int numero, Bebida bebida, Descuento descuento) {
        this.numero = numero;
        this.bebida = bebida;
        this.descuento = descuento;
    }

    public void agregarObservador(PedidoListoObserver observer) {
        observadores.add(observer);
    }

    public void marcarListo(){
        for(PedidoListoObserver observer : observadores){
            observer.pedidoListo(this);
        }
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
