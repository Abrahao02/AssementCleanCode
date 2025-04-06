package frete;

import domain.Entrega;

public class FreteEconomico implements CalculadoraFrete {
    @Override
    public double calcular(Entrega entrega) {
        return entrega.getPeso() * 1.1 - 5;
    }
}
