
# Sistema de Pedidos com Frete e Promoções

Este projeto foi desenvolvido como parte da disciplina de **Engenharia de Software - Clean Code e Boas Práticas**, do curso de **Engenharia de Software** do **Instituto INFNET**.

## 💡 Objetivo

Refatorar um codigo ''Legado'' transformando em um sistema simples de pedidos que simula o cálculo de frete e aplicação de promoções, utilizando princípios de **responsabilidade única**, **separação de preocupações** e **legibilidade** no código.

## 🧩 Funcionalidades

- Cálculo de frete com base no tipo e peso do envio.
- Aplicação de diferentes tipos de **promoções** (frete grátis, metade do preço ou sem promoção).
- Geração de **etiqueta de entrega**.
- Exibição de um **resumo do pedido** com as informações formatadas.
- Verificação se o frete ficou grátis após aplicação da promoção.

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Padrões de projeto orientados a objetos
- Boas práticas de código limpo (Clean Code)

## 📁 Estrutura de Pacotes

```
src/
├── domain/
│   ├── Entrega.java
│   ├── TipoFrete.java
│   ├── TipoPromocao.java
│   └── desconto/
│       ├── Promocao.java
│       ├── SemDesconto.java
│       ├── FreteGratis.java
│       ├── MetadePreco.java
│       └── CalculadoraDesconto.java
├── frete/
│   ├── CalculadoraFrete.java
│   ├── FreteExpresso.java
│   ├── FretePadrao.java
│   └── FreteEconomico.java
├── service/
│   └── EtiquetaService.java
└── SistemaPedidos.java
```

## ✅ Exemplos de Promoções

```java
// Sem promoção
new Entrega("Carolina Santos, 17", 10, TipoFrete.PADRAO, TipoPromocao.SEM_PROMOCAO, "Eduardo");

// Metade do preço
new Entrega("General Ozorio, 2", 110, TipoFrete.ECONOMICO, TipoPromocao.METADE_DO_PRECO, "Guilherme");

// Frete grátis
new Entrega("Rua das Flores, 123", 12.5, TipoFrete.EXPRESSO, TipoPromocao.FRETE_GRATIS, "Vinicius");
```

## 🧼 Princípios Adotados

- **Clean Code**: nomes significativos, classes coesas, métodos curtos e claros.
- **Boas Práticas**: uso de `interface`, composição ao invés de herança, divisão por pacotes de domínio, estratégia e serviço.

## 👨‍🎓 Autor

**Eduardo de Sá Abrahão**  
Curso de **Engenharia de Software**  
**Instituto INFNET**
