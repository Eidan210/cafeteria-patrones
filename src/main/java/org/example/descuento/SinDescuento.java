package org.example.descuento;

public class SinDescuento implements Descuento{

    @Override
    public int aplicar(int total){
        return total;
    }

}
