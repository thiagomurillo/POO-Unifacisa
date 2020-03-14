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

class MainRefeicao{
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
  int gramasProteina;
  int tempoCozimento; 
  double preco; 
  
  public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina,
			int tempoCozimento, double preco) {
   this.nome = nome;
   this.carboidrato = carboidrato;
   this.gramasCarboidrato = gramasCarboidrato;
   this.proteina = proteina;
   this.gramasProteina = gramasProteina;
   this.tempoCozimento = tempoCozimento;
   this.preco = preco;
	}
}

class MainRefeicao{
  public static void main(String [] args){
    Refeicao almoco = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 10);
    Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 7);
  }
}
```

Esse construtor permitiria instanciar uma Refeicao com valores específicos. 
Construtores com argumentos podem ter diferentes quantidade de argumentos -- não há uma regra específica.
Quando o nome de um argumento é igual ao nome de uma variável da instância (var global), o uso do *this* se faz necessário para remover a ambiguidade.
Nesse caso, o this se refere à variável global. 
No entanto, se o nome de um argumento não é igual ao nome de uma variável da instância, o *this* não é mandatório (embora seja uma boa prática).
Quando um construtor com argumentos é adicionado, o construtor default deixa de existir.

Também é possível criar vários construtores, se assim for desejado.
O nome disto é **sobrecarga**.
No exemplo anterior poderíamos criar um construtor adicionar que cria a referição apenas com nomes da proteína e carboidrato.
Em seguida, os demais valores poderiam ser atribuídos diretamentes, pois nesse exemplo os atributos são acessíveis (modificador default).
O que diferencia qual construtor será chamado é a quantidade e ordem dos parâmetros no momento de instanciação do objeto.

```java
class Refeicao{
  String nome;
  String carboidrato;
  int gramasCarboidrato;
  String proteina;
  int gramasProteina;
  int tempoCozimento; 
  double preco; 
  
  public Refeicao(){ }
  
  public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco){
    this.nome = nome;
    this.carboidrato = carboidrato;
    this.gramasCarboidrato = gramasCarboidrato;
    this.proteina = proteina;
    this.gramasProteina = gramasProteina;
    this.tempoCozimento = tempoCozimento;
    this.preco = preco;
  }
  
  public Refeicao(String carboidrato, String proteina){
    this.carboidrato = carboidrato;
    this.proteina = proteina;
    this.nome = carboidrato + " com " + proteina;
  }
}

class MainRefeicao{
  public static void main(String [] args){
    Refeicao almoco1 = new Refeicao();
    almoco1.nome = "feijão com bife";
    almoco1.carboidrato = "feijao";
    almoco1.gramasCarboidrato = 100;
    almoco1.proteina = "bife";
    almoco1.gramasProteina = 80;
    almoco1.tempoCozimento = 30;
    almoco1.preco = 10;

    Refeicao almoco2 = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 10);
    Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 7);
    Refeicao cafeDaManha = new Refeicao("batata doce", "ovo");

    imprimirRefeicao(almoco1);
    imprimirRefeicao(almoco2);
    imprimirRefeicao(jantar);
    imprimirRefeicao(cafeDaManha);
  }
  
  private static void imprimirRefeicao(Refeicao r) {
   System.out.println("Nome: "+r.nome);
   System.out.println("Carboidrato: "+r.carboidrato);
   System.out.println("Carboidrato(peso): "+r.gramasCarboidrato+ " g");
   System.out.println("Proteina: "+r.proteina);
   System.out.println("Proteina(peso): "+r.gramasProteina + " g");
   System.out.println("Tempo cozimento: "+r.tempoCozimento + "min");
   System.out.println("Preco: R$"+ r.preco + "\n\n");
	}
}
```
---

Saída do exemplo anterior:

Nome: feijão com bife
Carboidrato: feijao
Carboidrato(peso): 100 g
Proteina: bife
Proteina(peso): 80 g
Tempo cozimento: 30min
Preco: R$10.0


Nome: feijão com bife
Carboidrato: feijao
Carboidrato(peso): 100 g
Proteina: bife
Proteina(peso): 80 g
Tempo cozimento: 30min
Preco: R$10.0


Nome: inhame com ovo
Carboidrato: inhame
Carboidrato(peso): 80 g
Proteina: ovo
Proteina(peso): 40 g
Tempo cozimento: 15min
Preco: R$7.0


Nome: batata doce com ovo
Carboidrato: batata doce
Carboidrato(peso): 0 g
Proteina: ovo
Proteina(peso): 0 g
Tempo cozimento: 0min
Preco: R$0.0

---


Dessa forma, com classes (com atributos, funções e construtores) e objetos é possível criar programas que representem o mundo real.
Essa organização de entidades em classes e respectivos objetos é o que rege o paradigma de programação orientada a objetos.


