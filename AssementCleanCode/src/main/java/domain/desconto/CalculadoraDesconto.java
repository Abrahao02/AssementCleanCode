package domain.desconto;

import domain.TipoPromocao;

public class CalculadoraDesconto {
    public static Promocao obterPromocao(TipoPromocao tipoPromocao) {
        switch (tipoPromocao) {
            case FRETE_GRATIS:
                return new FreteGratis();
            case METADE_DO_PRECO:
                return new Desconto50PorCento();
            case SEM_PROMOCAO:
            default:
                return new SemDesconto();
        }
    }
}
