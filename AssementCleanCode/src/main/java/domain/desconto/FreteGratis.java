package domain.desconto;

import domain.Entrega;

public class FreteGratis implements Promocao {
    @Override
    public double aplicarDesconto(Entrega entrega) {
        return 0.0;
    }
}
