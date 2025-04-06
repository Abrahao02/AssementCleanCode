import domain.Entrega;
import domain.TipoFrete;
import domain.TipoPromocao;
import service.EtiquetaService;

public class SistemaPedidos {
    public static void main(String[] args) {
        try {
            // Criando uma entrega com frete expresso e promoção de 50%
            Entrega entrega = new Entrega(
                    "Rua das Flores, 123",
                    12.5,
                    TipoFrete.EXPRESSO,
                    TipoPromocao.FRETE_GRATIS,
                    "João da Silva"
            );

            EtiquetaService etiquetaService = new EtiquetaService();

            System.out.println("--- ETIQUETA ---");
            System.out.println(etiquetaService.gerarEtiqueta(entrega));

            System.out.println("\n--- RESUMO ---");
            System.out.println(etiquetaService.gerarResumo(entrega));

            System.out.println("\nFrete grátis? " + entrega.isFreteGratis());

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
