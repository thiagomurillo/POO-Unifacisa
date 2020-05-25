# Exercícios sobre Interfaces (Introdução a Classes Abstratas)

Vamos implementar parte de um sistema para um Restaurante.

1. Crie a interface Item.
     - getPreco(): double
     - getDescricao(): String

2. Crie um enum chamado Tamanho.
     - PEQUENO: não adiciona custo
     - MEDIO: adiciona custo de R$2
     - GRANDE: adiciona custo de R$2.8

3. Crie um enum chamado Refrigerante.
     - GUARANA: custa R$5
     - COCA: custa R$5.5
     - SPRITE: adiciona custo de R$4
     - FANTA: adiciona custo de R$4

3. Crie uma classe abstrata chamada Bebida, que é um Item.
     - getTamanho(): Tamanho  //função concreta
     - sabor: String          //variável
     - construtor: recebe sabor e tamanho
         - lança SaborInvalidoException
     - *getSabor(): String*   //função abstrata     
     

 
3. Crie a Interface Refeicao, que também é um Item.
     - getTamanho(): char
