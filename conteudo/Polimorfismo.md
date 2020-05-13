# Polimorfismos

Polis é uma palavra grega que significa *muitas*.
Morfo é outra palavra grega que significa *formas*.
Portanto, *polimorfismo* quer dizer **várias formas**.

Mas como assim, várias formas???
Quem é a entidade que assume várias formas??

Bem... Um objeto de um tipo específico A, uma vez criado, ele sempre será do tipo específico A.

```java
class Refeicao{
	String nome, carboidrato, proteina;
	int gramasCarboidrato, gramasProteina, tempoCozimento;
	double preco; 
	
  //construtor e métodos
}

class MainRefeicao{
	public static void main(String [] args){
		FormaGeometrica almoco = new Refeicao("feijão com bife", "feijao", 100, "bife", 80, 30, 10);
		Refeicao jantar = new Refeicao("inhame com ovo", "inhame", 80, "ovo", 40, 15, 7);
	}
}
```

No exemplo acima, instanciamos dois objetos: um almoço e um jantar.
Cada objeto instanciado tem seu próprio espaço bem definido na memória RAM..
Uma representação gráfica desses objetos na memória RAM poderia ser a seguinte:

![alt text](imgs/variaveis-instancia.png)

O objeto que está na posição 37843 da memória é do tipo Refeição.
De forma análoga, o objeto que está na posição 98239 também é do tipo Refeição.
Durante todo o ciclo de vida de um objeto ele jamais muda seu tipo.
Portanto, os objetos na posição de memória 37843 e 98239 serão do tipo Refeição até deixarem de existir (quando forem coletados pelo coletor de lixo da JVM).

No entanto, as *variáveis de referência podem mudar o endereço de memória para onde estão apontando*.
Em outras palavras, variáveis de referência podem apontar para outro objeto diferente do objeto corrente para o qual ela aponta.
A única restrição é que variáveis de referência de um tipo A não apontem para um objeto de referência de um tipo B, se B não for subclasse de A.
Tecnicamente falando, uma variável de referência de um tipo A só pode apontar para um objeto do tipo B *if(B instanceof A)*

Observem a imagem a seguir:

![alt text](imgs/heranca.png)


