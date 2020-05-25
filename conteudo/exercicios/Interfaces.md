# Exercícios sobre Interfaces (Introdução a Classes Abstratas)

Vamos implementar parte de um sistema para um Restaurante.

1. Crie a interface Item.
     - getPreco(): double
     - getDescricao(): String

2. Crie a Interface Refeicao, que também é um Item.
     - getProteina(): Proteina          //ENUM
     - getCarboidrato(): Carboidrato    //ENUM

3. Crie um enum chamado Proteina.
     - PICANHA: adiciona custo de R$20
     - MAMINHA: adiciona custo de R$15
     - FRANGO: adiciona custo de R$15
     - LINGUICA: adiciona custo de R$10
     - seja criativo, e crie os valores que você acha que poderia aparecer no cardápio

4. Crie um enum chamado Carboidrato.
     - FEIJAO: adiciona custo de R$2
     - ARROZ: adiciona custo de R$1.5
     - PURE: adiciona custo de R$1.5
     - BATATA: adiciona custo de R$1
     - seja criativo, e crie os valores que você acha que poderia aparecer no cardápio

5. Crie diferentes implementações de refeições.

6. Crie uma classe **abstrata** chamada Bebida, que é um Item.
     - construtor: recebe Tamanho e SaborBebida
     - tamanho: Tamanho       //variável
     - getTamanho(): Tamanho  //função concreta
     - sabor: SaborBebida     //variável     
     - getSabor(): SaborBebida   //função concreta     
     
7. Crie um enum chamado Tamanho.
     - PEQUENO: não adiciona custo
     - MEDIO: adiciona custo de R$2
     - GRANDE: adiciona custo de R$2.8
 
8. Crie um enum chamado SaborBebida.
     - seja criativo, e crie os valores que você acha que poderia aparecer no cardápio
     - ex: coca, guarana, suco de laranja, agua com gas, cerveja, whisky, etc.

9. Crie diferentes implementações de Bebidas.

10. Crie a classe Cliente.
    - nome: String
    - mesa: int
    - pedidos: List<Item>
    
11. Crie a classe SistemaRestaurante.
    - métodos:
        - adicionarCliente(Cliente): void
        - adicionarPedido(Cliente, Item): void
            - pode lancar ClienteInexistenteException
        - removerPedido(Cliente, Item): void
            - pode lancar PedidoInexistenteException
        - computarPagamentoCliente(Cliente): double
        - receberPagamentoCliente(Cliente,double): void
            - pode lancar PagamentoInvalidoException

12. Criar testes para Sistema Restaurante.
