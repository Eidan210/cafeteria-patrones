package org.example.bebida;

public class Leche extends ExtraDecorator{

    public Leche(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Leche";
    }

    @Override
    public int getPrecio(){
        return bebida.getPrecio() + 500;
    }
}
