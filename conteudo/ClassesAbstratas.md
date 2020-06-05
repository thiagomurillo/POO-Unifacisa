# Classes Abstratas

Classes abstratas são classes que possuem algum nível de indefinição, ou seja, possuem alguma parte abstrata.
Essa indefinição ocorre através da não especificação de funcionamento de alguma função (ou funções).
Basicamente, é possível especificar somente a assinatura (primeira linha) de uma função, mas não o seu funcionamento (corpo da função).

**Funções especificadadas apenas com assinatura, sem definição de corpo, são chamadas funções abstratas.**

## Nível de Abstração

- Interfaces detém os níveis mais altos de abstração: todos os seus métodos são abstratos.
- Classes abstratas detém níveis intermediários de abstração: podem possui métodos abstratos.
- Classes (concretas) detém os menores níveis de abstração: não possuem nenhum método abstrato.

Embora os métodos em interfaces se reservem ao direito de não tornar explícito que são abstratos, todos eles são abstratos.
Note que sempre que tivermos alguma possibilidade de abstração, no sentido de haver função sem comportamento definido, então essa entidade não poderá ser instanciada.
Portanto, nem interfaces nem classes abstratas podem ser instanciadas.

**E o que ganhamos com toda essa abstração? Ela promove o polimorfismo, e o polimorfismo torna o nosso código flexível e extensível.**
Por flexibilidade entenda como capacidade de sofrer alteração com impacto mínimo.
Por extensibilidade entenda como capacidade de adicionar mais funcionalidades (classes/funçes) com impacto mínimo.

## Implementação das Funções Abstratas

Toda classe concreta que implementa uma interface deve fornecer implementações para as funções abstratas herdadas.
Se alguma função abstrata herdada não for implementada, a classe deverá ser abstrata (de outro modo não compilará).
Por outro lado, também podemos criar classes abstratas que não implementam interfaces, mas que definem alguns, todos, ou nenhum método abstrato.
Todas as funções abstratas herdadas devem ser implementadas pela classe filha concreta mais próxima.

Observe o diagrama UML a seguir:

<p align="center">
  <img src="https://github.com/eduardolfalcao/POO-Unifacisa/blob/master/conteudo/imgs/abstratas1.png"/ width="318" height="325">
</p>

A função getBonificacao() é abstrata na classe abstrata Funcionario.
Logo, deve ser implementada por suas classes filhas diretas.
Presidente e Gerente proveem uma implementação para getBonificacao().
Diretor não precisa implementar getBonificacao() pois ele não herda essa responsabilidade; Gerente herdou a responsabiliade e já implementou.
Porém, se quiser, diretor poderia sobrescrever getBonificacao(), mas sem nenhuma obrigação.
Outra opção seria Gerente se manter uma classe abstrata, se eximindo da responsabilidade de implementar getBonificacao(), mas nesse caso Diretor (para ser concreto) deveria fornecer a implementação de getBonificacao().

Observe o seguinte diagrama UML:

<p align="center">
  <img src="https://github.com/eduardolfalcao/POO-Unifacisa/blob/master/conteudo/imgs/abstratas2.png"/ width="634" height="337">
</p>

Neste caso, Secretaria não implementa getBonificacao(), mas não tem problema, pois como Secretaria é uma classe abstrata, ela pode ter funções (neste caso herdada) abstratas.
Mas as subclasses concretas de Secretaria precisam implementar getBonificacao().

Tudo se trata de responsabilidades.
Classes abstratas não têm obrigação de nada!
Classes concretas têm obrigação de possuir todas as funções herdadas definidas de modo concreto.

## E variáveis?

Classes abstratas, diferentemente de interfaces, podem ter variáveis de instância, que não são constantes.

## Como declarar Classes e Funções?

- Classes: colocar **abstract** antes de *class*.
- Funções: colocar **abstract** antes do *tipo de retorno da função*.

## Como são os relacionamentos?

- Classes abstratas **implements** interfaces
- Classes abstratas **extends** classes abstratas
- Classes concretas **extends** classes abstratas
