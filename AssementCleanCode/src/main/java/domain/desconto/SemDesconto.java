package domain.desconto;

import domain.Entrega;

public class SemDesconto implements Promocao {
    @Override
    public double aplicarDesconto(Entrega entrega) {
        return entrega.getCustoEntrega(); // sem alteração
    }
}
