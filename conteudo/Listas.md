# Listas

Listas têm a mesma finalidade de arrays: armazenar elementos de um mesmo tipo.
No entanto, um aspecto interessante é que listas podem mudar de tamanho.
Elas podem crescer seus tamanhos de acordo com nossa conveniência.
Enquanto arrays jamais podem crescer ou diminuir em sua capacidade, as listas fazem isso de forma transparente.

## Principais Métodos

Vamos ver os principais métodos de listas no exemplo a seguir:

```java
	List<String> nomes = new ArrayList<String>();
		
	nomes.add("Eduardo");	//adiciona objeto String com conteúdo "Eduardo"
	nomes.add("Mariana");
	nomes.add("Joao");
		
	System.out.println("Nomes: "+nomes);	//toString
	System.out.println("Tamanho da lista de nomes: "+nomes.size());	
	System.out.println("A lista nomes contém a String \"Eduardo\"? "+nomes.contains("Eduardo"));
	System.out.println("Em que posição se encontra a String \"Eduardo\"? "+nomes.indexOf("Eduardo"));
	System.out.println("Qual objeto está na posição 2 da lista? "+nomes.get(2));
		
	//remove é um método sobrecarregado
	nomes.remove(0);		//remove objeto no índice 0
	nomes.remove("Joao");	//remove objeto String com conteúdo João				
	System.out.println("Nomes: "+nomes+"\n\n");
		
	//for each
	for(String nome : nomes) {
		System.out.println("Nome: "+nome);
	}
		
	nomes.clear();			//remove todos os objetos da lista 		
	System.out.println("Nomes: "+nomes);
```

Na primeira linha, vemos que para criar uma lista, precisamos definir o tipo de objeto que poderá entrar nela.
Neste caso, *nomes* representa uma lista de Strings.
Em seguida, usamos uma séria de métodos na lista:

Os principais métodos são:
- add(Object o): permite adicionar um objeto ao fim da lista
- size(): retorna o tamanho da lista
- contains(Object o): verifica se a lista contém o objeto especificado
- indexOf(Object o): retorna o índice do objeto especificado
- get(int index): retorna o objeto no índice especificado
- remove(int index): remove o objeto no índice especificado
- remove(Object o): remove o objeto especificado
- clear(): remove todos os objetos da lista

## Listas só Armazenam Objetos

O segundo aspecto das listas é que elas não armazenam tipos primitivos.
Listas só guardam objetos.
Mas isso não é um problema, pois todos os tipos primitivos básicos podem ser instanciados na forma de objeto.
É o que chamamos de *wrappers* (podemos traduzir para *empacotadores*).

Segue exemplo com *wrappers* (classes):
```java
Boolean b = new Boolean(true);
Character c = new Character('c');
Byte by = new Byte((byte) 10);
Short sh = new Short((short) 10);
Integer i = new Integer(10);
Long l = new Long(10l);
Float f = new Float(10.0f);
Double d = new Double(10.0);
```

Todas as variáveis acima apontam para objetos que servem como uma espécie de invólucro para os primitivos.
Ou seja, é uma alternativa para que um valor de tipo primitivo apareça na forma de objeto.

Mas se temos *wrappers*, por que usar os tipos primitivos? 
Simples, eles são mais rápidos e consomem menos memória, afinal não tem implementação de métodos ou qualquer outro algoritmo complexo que venha a consumir mais tempo da JVM.

Apesar do código citado anteriormente funcionar, a utilização de construtores para criar os *wrappers* não é recomendada: está depreciada.
A solução é o que chamamos de **boxing**.

## Autoboxing, Boxing, e Unboxing



## Performance: ArrayList e LinkedList
