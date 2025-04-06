package domain;

import frete.*;

public enum TipoFrete {
    PADRAO {
        @Override
        public CalculadoraFrete getCalculadora() {
            return new FretePadrao();
        }
    },
    EXPRESSO {
        @Override
        public CalculadoraFrete getCalculadora() {
            return new FreteExpresso();
        }
    },
    ECONOMICO {
        @Override
        public CalculadoraFrete getCalculadora() {
            return new FreteEconomico();
        }
    };

    public abstract CalculadoraFrete getCalculadora();
}
