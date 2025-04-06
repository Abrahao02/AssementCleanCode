package domain.desconto;

import domain.Entrega;

public class Desconto50PorCento implements Promocao {
    @Override
    public double aplicarDesconto(Entrega entrega) {
        return entrega.getCustoEntrega() * 0.5;
    }
}
