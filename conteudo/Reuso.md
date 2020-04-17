# Reuso de Código

Uma das práticas que todo programador deve abominar é código duplicado.
Código duplicado é ruim porque sempre que houver alguma mudança em um determinado algoritmo, o programador deverá procurar procurar ocorrências daquele algoritmo em seu programa, e realizar a mudança.
No mundo do desenvolvimento de software, **mudança é quase uma certeza**.
Os programadores têm alguma resistência em realizar mudanças em seu programa, por causa do retrabalho.
Mas a mudança do código do programa vai acontecer com certa frequência.
Programas mudam porque:
1. o programador implementou uma funcionalidade errada (entendeu mal os requisitos listados pelos clientes)
2. O programador encontrou um bug no programa que precisa ser corrigido
3. O cliente mudou de ideia a respeito de uma funcionalidade que havia solicitado
4. O gerente do projeto pressionou a equipe para entregar funcionalidades do programa e, diante da pressão, a equipe não respondeu bem e implementou as funcionalidades com más práticas de design
5. Dentre outras situações.

No paradigma de programação orientada a objetos existem duas formas de promover o  reuso de código: composição e herança.

## Composição

Sempre que uma determinada classe A tiver uma variável de referência de uma outra classe B, dizemos que **A tem B**.
Quando **A tem B**, a classe A tem acesso a todas as variáveis e funções públicas de B.
Por essa razão, A reusa o código de B.
Nesse caso, A reusa B através da *composição*.

Suponha que você esteja criando um aplicativo como o Uber.
Poderíamos ter as seguintes classes, por exemplo: Motorista, Cliente, Corrida.
Imagine que Motorista e Cliente possuam variáveis para armazenar a data de ingresso no Uber.
Também considere que a classe Corrida deve ter variáveis para armazenar a data de acontecimento daquele serviço.
Se não usarmos composição, poderíamos ter classes parecidas com estas:
```java
class Motorista{
  private String nome;
  private String cpf;
  private int diaIngresso, mesIngresso, anoIngresso, horaIngresso, minutoIngresso;
  private Conta contaRecebimento;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Cliente{
  private String nome;
  private String cpf;
  private Conta contaPagamento;
  private int diaIngresso, mesIngresso, anoIngresso, horaIngresso, minutoIngresso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  //inicio da corrida
  private int diaInicio, mesInicio, anoInicio, horaInicio, minutoInicio;
  //fim da corrida
  private int diaFim, mesFim, anoFim, horaFim, minutoFim;
  private double km;
  
  //demais atributos e funções
}
```

Se criarmos a classe Data, podemor por composição evitar a duplicação de código.

```java

class Data{
  private int dia, mes, ano, hora, minuto;
  //construtor e funções
}

class Motorista{
  private String nome;
  private String cpf;
  private Data dataIngreso;
  private Conta contaRecebimento;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Cliente{
  private String nome;
  private String cpf;
  private Conta contaPagamento;
  private Data diaIngreso;
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Corrida{
  private Data dataInicio;  //inicio da corrida
  private Data dataFim;     //fim da corrida
  private double km;
  
  //demais atributos e funções
}
```
