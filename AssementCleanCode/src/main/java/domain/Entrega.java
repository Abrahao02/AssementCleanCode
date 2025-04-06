package domain;

import domain.desconto.CalculadoraDesconto;
import domain.desconto.Promocao;
import frete.CalculadoraFrete;

public class Entrega {
    private String endereco;
    private double peso;
    private TipoFrete tipoFrete;
    private TipoPromocao tipoPromocao;
    private String destinatario;
    private double custoEntrega;

    public Entrega(String endereco, double peso, TipoFrete tipoFrete, TipoPromocao tipoPromocao, String destinatario) {
        this.endereco = endereco;
        this.peso = peso;
        this.tipoFrete = tipoFrete;
        this.tipoPromocao = tipoPromocao;
        this.destinatario = destinatario;

        // usar instância de CalculadoraFrete baseada no tipoFrete
        CalculadoraFrete calculadora = tipoFrete.getCalculadora();
        this.custoEntrega = calculadora.calcular(this);

        // aplicar promoção
        Promocao promocao = CalculadoraDesconto.obterPromocao(tipoPromocao);
        this.custoEntrega = promocao.aplicarDesconto(this);
    }

    public double getCustoEntrega() {
        return custoEntrega;
    }

    public boolean isFreteGratis() {
        return this.custoEntrega == 0.0;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getEndereco() {
        return endereco;
    }

    public TipoFrete getTipoFrete() {
        return tipoFrete;
    }

    public TipoPromocao getTipoPromocao() {
        return tipoPromocao;
    }

    public double getPeso() {
        return peso;
    }
}
