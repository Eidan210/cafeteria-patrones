package org.example.aviso;

import org.example.pedido.Pedido;
import org.example.pedido.PedidoListoObserver;

public class PantallaAvisos implements PedidoListoObserver {

    @Override
    public void pedidoListo(Pedido pedido){
        System.out.println("[PANTALLA] Pedido N."+ pedido.getNumero()+ " Listo.");
    }
}
