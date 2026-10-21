package org.example.aviso;

import org.example.pedido.Pedido;
import org.example.pedido.PedidoListoObserver;

public class Cliente implements PedidoListoObserver {

    private final String nombre;

    public Cliente(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void pedidoListo(Pedido pedido){
        System.out.println("Hola "+ nombre + ", tu pedido #" + pedido.getNumero() + " está listo: "+ pedido.getBebida().getDescripcion());
    }
}
