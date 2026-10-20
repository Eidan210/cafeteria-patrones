package org.example.bebida;

public class ShotExtra extends ExtraDecorator {
    public ShotExtra(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion(){
        return bebida.getDescripcion() + " + Shot Extra";
    }

    @Override
    public int getPrecio(){
        return bebida.getPrecio() + 1500;
    }
}
