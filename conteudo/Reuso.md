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
Poderíamos ter as seguintes classes, por exemplo: Motorista, Passageiro, Corrida.
Imagine que Motorista e Passageiro possuam variáveis para armazenar a data de ingresso no Uber.
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

class Passageiro{
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

class Passageiro{
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

No exemplo que usamos a composição como estratégia de reuso de código nós temos uma facilidade maior para se adaptar à mudanças.
Nosso programa se torna flexível.
Nessa situação, uma mudança qualquer referente à datas, de modo geral, se restringe à classe data.

Imagine que o atributo *segundos* é importante para o nosso programa.
Basta acrescentar na classe Data, em vez de acrescentar em todas as classes (Motorista, Passageiro, e Corrida).

```java
class Data{
  private int dia, mes, ano, hora, minuto, segundo;
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

class Passageiro{
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

No exemplo anterior ainda existem variáveis duplicadas: nome, cpf, conta.
Também é possível usar a composição para essa situação (no entanto, eu acho que o código fica um pouco estranho em termos de legibilidade de relacionamentos).
Para evitar a duplicação de *nome, cpf, conta*, podemos jogar essas variáveis em uma classe chamada Pessoa.

```java
class Data{
  private int dia, mes, ano, hora, minuto, segundo;
  //construtor e funções
}

class Pessoa{
  private String nome;
  private String cpf;
  private Conta conta;
  //construtor e funções
}

class Motorista{
  private Pessoa pessoa;
  private Data dataIngreso;  
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro{
  private Pessoa pessoa;
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

Através do atributo *pessoa*, Motorista e Passageiro podem obter informações como nome, cpf, e conta, possivelmente através de métodos públicos getters.
Portanto, temos um reuso.
Por outro lado, dizer que *Motorista tem uma Pessoa* e *Passageiro tem uma Pessoa*, é algo que não soa bem.
Parece não fazer sentido.
Bem... se o nome da classe Pessoa fosse mudado para DadosPessoa, talvez nessa situação a legibilidade de relacionamentos tivesse mais sentido: *Motorista tem um DadosPessoa* e *Passageiro tem um DadosPessoa*.

Não estou dizendo que essa abordagem está incorreta.
Na verdade, ela funciona bem, e é bastante poderosa (veremos adiante a razão).

Em seguida, veremos outra forma de reutilizar código.

## Herança

Na herança, podemos estabelecer relações hierárquicas entre classes.
Teremos uma classe mãe (ou pai) e várias classes filhas, que são as classes que herdam.
A saber, todas as classes de Java são filhas de Object, netas de Object, tataranetas de Object, etc.
Resumindo, todas as classes tem algum relacionamento direto ou indireto com Object.

A herança é estabelecida através da palavra-chave **extends**.
Se uma determinada classe não declara explicitamente que herda de outra classe, então aquela classe herda da classe Object.

No exemplo utilizado, podemos fazer as classes Motorista e Passageiro herdarem a classe Pessoa.
```java
class Data{
  private int dia, mes, ano, hora, minuto, segundo;
  //construtor e funções
}

class Pessoa{
  protected String nome;
  protected String cpf;
  protected Conta conta;
  //construtor e funções
}

class Motorista extends Pessoa{
  private Data dataIngreso;  
  private List<Corrida> corridas;  
  
  //demais atributos e funções
}

class Passageiro extends Pessoa{
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

Nesse código, **Motorista é uma Pessoa** e **Passageiro é uma Pessoa**.
A legibilidade de relacionamentos faz total sentido.
Note que o modificador de acesso dos atributos de Pessoa é *protected*, que permite a visibilidade daqueles atributos por sub-classes.

Nessa situação nós temos o reuso do código de Pessoa por Motorista e Passageiro.
Note que, para o reuso de Data, a herança não faria sentido pois seria estranho dizer que *Motorista é uma Data* e *Passageiro é uma Data*, e *Corrida é uma Data*.
Além disso, a classe Corrida precisa de duas datas, o que não seria possível apenas com herança.

### Sobrescrita

O que é sobrescrever.
Regras da sobrescrita.
Função da anotação @Override.
