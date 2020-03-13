# Classes e Objetos

Classes definem a especificação de entidades, trazendo consigo uma série de atributos e comportamentos (funções).
Objetos são criados a partir de classes, e quando criados tipicamente assumem diferentes valores para atributos, e podem executar as funções.

Analogia:
 - Planta baixa seria uma *classe*, e a casa seria o *objeto*. Note que várias casas (objetos) com detalhes (valores de atributos) diferentes podem ser construídas a partir de uma planta baixa (classe).
 - Uma refeição pode ser representada em uma *classe*, e o almoço/jantar feito pronto seria o *objeto*. Note que várias almoços/jantares (objetos) com detalhes (valores de atributos) diferentes podem ser construídos a partir de uma especificação de refeição alterando alguns detalhes.
 
```java
class Refeicao{
  String nome;
  String carboidrato;
  int gramasCarboidrato;
  String proteina;
  int gramasproteina;
  int tempoCozimento; 
  double preco;  
}

class Main{
  public static void main(String [] args){
    Refeicao almoco = new Refeicao();
    almoco.nome = "feijão com bife";
    almoco.carboidrato = "feijao";
    almoco.gramasCarboidrato = 100;
    almoco.proteina = "bife";
    almoco.gramasProteina = 80;
    almoco.tempoCozimento = 30;
    almoco.preco = 10;
  }
}
```
A palavra chave *new* permite a criação de novos objetos. 
No main, criamos um objeto almoço. 
Poderíamos criar vários objetos almoços, iguais ou diferentes (em termos de comida), bem como também poderíamos criar outros tipos de refeição como jantar e café da manhã.

Quando acionamos *new Refeicao()*, estamos chamando o contrutor da classe Refeicao. 
Contrutores são métodos que permitem a criação de objetos, e são acionado pela palavra reservada *new*.
Embora a classe Refeicao não apresente um contrutor de forma explícita, a JVM injeta o construto padrão (ou default).
Construtores padrões não tem argumento.
De forma resumida, para a JVM, a classe Refeicao aparece da seguinte forma:

```java
class Refeicao{
  String nome;
  String carboidrato;
  int gramasCarboidrato;
  String proteina;
  int gramasproteina;
  int tempoCozimento; 
  double preco;  
  public Refeicao(){}
}
```

Se for do interesse, é possível criar construtores com argumentos, como a seguir:
```java
class Refeicao{
  String nome;
  String carboidrato;
  int gramasCarboidrato;
  String proteina;
  int gramasproteina;
  int tempoCozimento; 
  double preco; 
  
  public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasproteina, int tempoCozimento, double preco){
    this.nome = nome;
    this.carboidrato = carboidrato;
    this.gramasCarboidrato = gramasCarboidrato;
    this.proteina = proteina;
    this.gramasproteina = gramasproteina;
    this.tempoCozimento = tempoCozimento;
    this.preco = preco;
  }
}

class Main{
  public static void main(String [] args){
    Refeicao almoco = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 10);
    Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 7);
  }
```

Esse construtor permitiria instanciar uma Refeicao com valores específicos. 
Construtores com argumentos podem ter diferentes quantidade de argumentos -- não há uma regra específica.
Quando o nome de um argumento é igual ao nome de uma variável da instância (var global), o uso do *this* se faz necessário para remover a ambiguidade.
Nesse caso, o this se refere à variável global. 
No entanto, se o nome de um argumento não é igual ao nome de uma variável da instância, o *this* não é mandatório (embora seja uma boa prática).
Quando um construtor com argumentos é adicionado, o construtor default deixa de existir.


Dessa forma, com classes (com atributos, funções e construtores) e objetos é possível criar programas que representem o mundo real.
Essa organização de entidades em classes e respectivos objetos é o que rege o paradigma de programação orientada a objetos.


