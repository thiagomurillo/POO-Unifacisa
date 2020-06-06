# Exercícios sobre Classes Abstratas

1. Geometria
    - Crie uma classe abstrata chamada Figura. 
        - Variáveis:
            - cor : Enum Cor (Amarelo, Azul, Branco, Cinza, Preto, Roxo, Verde, Vermelho)
        - Funções abstratas:
            - calculaArea(): double
            - calculaPerimetro(): double
    - Crie uma classe abstrata chamada Quadilatero, que é uma Figura. 
        - Variáveis:
            - lado1 : double
            - lado2 : double
            - lado3 : double
            - lado4 : double
    - Crie uma classe concreta chamada Quadrado, que é um Quadrilátero
    - Crie uma classe concreta chamada Retangulo, que é um Quadrilátero
    - Crie uma classe concreta chamada Trapezio, que é um Quadrilátero (pode passar altura do trapézio como argumento extra no construtor)
    - Crie uma classe concreta chamada Círculo, que é uma Figura. 
        - Variáveis:
            - raio : double


2.  Conta Bancaria           
    - Crie uma classe abstrata chamada ContaBancaria. 
        - Variáveis:
            - nome : String
            - senha : String
            - saldo : double
        - Funções concretas:
            - getNome(): String
            - getSaldo(): double 
        - Funções abstratas:
            - transferir(String senha, double valor, Conta conta): void
            - transferir lança SaldoInsuficienteException
            - transferir lança SenhaInvalidaException
        - Crie uma classe concreta chamada ContaPoupanca.
            - Custo fixo de R$5 para transferência. 
        - Crie uma classe concreta chamada ContaCorrente.
            - Custo de 0.25% do valor a ser transferido, se valor for menor do que R$5000.
            - Custo fixo de R$15 para valores iguais ou superiores à R$5000. 
    - Crie testes unitários para ContaPoupanca e ContaCorrente
    
    
        
