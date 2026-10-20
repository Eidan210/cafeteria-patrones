package org.example.bebida;

public class Canela extends ExtraDecorator {

    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Canela";
    }

    @Override
    public int getPrecio(){
        return bebida.getPrecio() + 300;
    }
}
