package org.example.descuento;

public class DescuentoPorcentaje implements Descuento {

    private final int porcentaje;

    public DescuentoPorcentaje(int porcentaje){
        this.porcentaje = porcentaje;
    }

    @Override
    public int aplicar(int total){
        return total - (total * porcentaje / 100);
    }
}
