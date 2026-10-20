package org.example.bebida;

public class Cafe implements Bebida{

    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public int getPrecio() {
        return 3000;
    }
}
