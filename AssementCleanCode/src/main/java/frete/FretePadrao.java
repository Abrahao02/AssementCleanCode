package frete;

import domain.Entrega;

public class FretePadrao implements CalculadoraFrete {
    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.2;
    }
}
