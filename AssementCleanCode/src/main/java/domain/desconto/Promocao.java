// domain/desconto/Promocao.java
package domain.desconto;
import domain.Entrega;

public interface Promocao {
    double aplicarDesconto(Entrega entrega);
}
