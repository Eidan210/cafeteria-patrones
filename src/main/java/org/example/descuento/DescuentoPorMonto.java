package org.example.descuento;

public class DescuentoPorMonto implements Descuento{

    private final int montoMinimo;
    private final int descuento;

    public DescuentoPorMonto(int montoMinimo, int descuento){
        this.montoMinimo = montoMinimo;
        this.descuento = descuento;
    }

    @Override
    public int aplicar(int total) {
        if (total >= montoMinimo) {
            return total - descuento;
        }
        return total;
    }
}
