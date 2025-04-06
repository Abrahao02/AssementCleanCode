package frete;

import domain.Entrega;

public class FreteExpresso implements CalculadoraFrete {
    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.5 + 10;
    }
}
