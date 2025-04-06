package service;

import domain.Entrega;
import domain.TipoFrete;
import domain.TipoPromocao;
import frete.*;

public class EtiquetaService {
    public String gerarEtiqueta(Entrega entrega) {
        return "Destinatário: " + entrega.getDestinatario()
                + "\nEndereço: " + entrega.getEndereco()
                + "\nValor do Frete: R$" + calcularFrete(entrega);
    }

    public String gerarResumo(Entrega entrega) {
        String resumo = String.format(
                "Pedido para %s com frete tipo %s no valor de R$%.2f",
                entrega.getDestinatario(),
                entrega.getTipoFrete(),
                entrega.getCustoEntrega()
        );

        if (entrega.getTipoPromocao() != null && entrega.getTipoPromocao() != TipoPromocao.SEM_PROMOCAO) {
            resumo += String.format(" (Promoção: %s)", entrega.getTipoPromocao().name().replace("_", " "));
        }

        return resumo;
    }



    private double calcularFrete(Entrega entrega) {
        CalculadoraFrete calculadora = getCalculadora(entrega.getTipoFrete());
        return calculadora.calcular(entrega);
    }

    private CalculadoraFrete getCalculadora(TipoFrete tipoFrete) {
        return switch (tipoFrete) {
            case EXPRESSO -> new FreteExpresso();
            case PADRAO -> new FretePadrao();
            case ECONOMICO -> new FreteEconomico();
        };
    }
}
