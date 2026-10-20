package org.example.bebida;

public abstract class ExtraDecorator implements Bebida {

    protected Bebida bebida;

    public ExtraDecorator(Bebida bebida){
        this.bebida = bebida;
    }
}
