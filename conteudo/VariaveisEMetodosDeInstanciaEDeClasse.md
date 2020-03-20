# Variáveis e Métodos de Instância e de Classe

Vocês já devem ter percebido que utilizamos o verbo **instanciar** como sinônimo de **criar um objeto**.
Portanto, quando alguém te pedir para instanciar um objeto de uma determinada classe, essa pessoa está te pedindo simplesmente para você criar um objeto daquela classe.

No mundo de programação orientada a objetos, podemos ter dois tipos de variáveis: as **variáveis de instância**, e as variáveis de **classe**.

Sempre que usamos a palavra reservada *new* em conjunto com um construtor, um objeto é criado.
Todo objeto criado carrega consigo variáveis de instância.
As variáveis de instância são, portanto, os atributos, que cada objeto traz consigo.
Toda variável que é declarada  **sem usar a palavra reservada static** é uma variável de instância (ou objeto, como queiram).

Vamos tomar como exemplo a seguinte classe Refeicao:

```java
class Refeicao{
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double preco; 
	
	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco) {
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

No exemplo acima, instanciamos dois objetos: um almoço e um jantar.
Cada objeto instanciado tem seu próprio espaço bem definido na memória RAM, e nele estão contidas as variáveis do objeto (ou da instância).
Uma representação gráfica desses objetos na memória RAM poderia ser a seguinte:

![alt text](conteudo/imgs/variaveis-instancia.png)

Note que cada objeto tem seus atributos com valores diferentes.
Esses atributos são as variáveis de instância.
Se nós mudarmos os valores dos atributos do objeto referenciado pela variável almoço, os valores dos atributos objeto referenciado pela variável jantar **não mudam**.
Isto acontece pois essas variáveis são de instância e, portanto, pertencem ao objeto que foi criado.

No exemplo a seguir, depois de criar os objetos, alguns valores de atributos do objeto refenciado pela variável almoço e o preço do objeto refenciado pela variável jantar são alterados.

```java
class MainRefeicao{
    public static void main(String [] args){
        Refeicao almoco = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 10);
        Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 7);
        
        almoco.nome = "feijão com picanha";
        almoco.proteina = "picanha";
        almoco.gramasProteina = 200;
        almoco.preco = 30;
        
        jantar.preco = 12;
    }
}
```

Ilustramos essa mudança com a seguinte imagem:

![alt text](conteudo/imgs/variaveis-instancia-valores-alterados.png)

Além das variáveis de instância também existem as **variáveis de classe (ou estáticas)**.
Variáveis de classe não pertencem ao contexto do objeto.
Não é preciso criar objetos para que as variáveis de classe existam.
Variáveis de classe independem da existência de objetos.

No exemplo anterior, se quiséssemos configurar um preço básico de 10 reais todo e qualquer tipo de refeição, poderíamos criar uma variável de classe.
Para criar uma variável de classe, basta declará-la como **static**.

Observe o exemplo a seguir:

```java
class Refeicao{

  //variáveis estáticas
	static double precoBase;
  
  //variáveis de instância
  String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double precoAdicional; 
	
	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double precoAdicional) {
		this.nome = nome;
		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.precoAdicional = precoAdicional;
	}
}

class MainRefeicao{
	public static void main(String [] args){
		Refeicao.precoBase = 10;
    
    Refeicao almoco = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 2);
    Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 0);
	}
}
```

No exemplo anterior, antes mesmo de criar qualquer objeto eu defini que o preço mínimo de qualquer refeição seria 10 reais.
Em seguida, criei um objeto representando um almoço, e um objeto representando um jantar.
Note que ambos os objetos terão um preço base de 10 reais.
Embora a variável não esteja dentro da área de memória do objeto, os objetos conseguem enxergá-las e manipulá-las.
Neste caso, o almoço custa 10+2 reais, e o jantar custa 10+0 reais.

Segue ilustração:

![alt text](conteudo/imgs/variaveis-classe.png)

É uma boa prática e extremamente recomendado que use o nome da classe para referenciar variáveis estáticas.
Ex: "Refeicao.precoBase = 10;".
Embora dentro da classe Refeicao usar apenas o nome da variável funcione, essa recomendação também deve ser seguida.

