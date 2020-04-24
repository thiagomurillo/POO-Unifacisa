# Exercícios sobre Exceções

- Qual a estrutura sintática básica para capturar e tratar uma exceção? O que deve ser colocado em cada bloco?
- O que são exceções checadas e não-checadas? Qual o impacto disso no programa?
- Como são criadas exceções checadas e não-checadas?
- Capturar uma exceção de alta hierarquia (e.g., Exception) é uma boa prática? Justifique.

Para resolução destas questões, utilize as classes contidas neste [pacote](https://github.com/eduardolfalcao/POO-Unifacisa/tree/master/src/excecoes/exercicios).

1. Modifique a classe Mes para que lance uma exceção com nome MesInvalidoException quando for fornecido um parâmetro menor que 1 ou maior que 12 no construtor.
Altere a classe NomeDoMesApp para que o método main encerre execução imprimindo a mensagem "O número do mês deve estar contido no intervalo [1, 12]" quando for fornecido um valor fora do intervalo entre 1 e 12.

2. Altere a classe Pessoa para que esta lance uma exceção chamada NomeInvalidoException com a mensagem "O nome fornecido não pode ser nulo ou vazio" no método setNome, se o nome fornecido for nulo ou vazio. 
Modifique a classe NomeInvertidoApp para que solicite que o usuário digite um nome que será repassado para o método setNome, enquanto o nome fornecido for nulo ou vazio. 
Se esta situação ocorrer, deverá ser impresso a mensagem da exceção.
O que aconteceria se em vez de NomeInvalidoException você lançasse IllegalArgumentException, classe já existente do java.

3. Sabendo que uma data segue limitações de acordo o mês (mês com apenas 30 dias e ano bissexto), complemente a classe Mes para que esta lance exceção quando for fornecido um dia incompatível com o mês e o ano em seu construtor. 
A exceção lançada deverá se chamar DataInvalidaException e deve possuir a seguinte mensagem de erro: "Os parâmetros fornecidos não representam uma data válida". 
Altere o método main da classe IntervaloDeDiasApp para que este solicite uma nova data (dia, mês e ano) sempre que o construtor de Data for chamado e este lançar exceção (cuja mensagem de erro deverá ser impressa).

4. Crie uma classe de exceções com nome JogoEncerradoException e com mensagem de erro "Não é permitido tentar mais palpites, o jogo está encerrado". 
Altere a classe Forca para que esta lance a exceção criada se o método tentar palpite for chamado e o jogo já acabou. 
O jogo acabou se o jogador já ganhou ou já perdeu. 
Modifique o método main da classe JogoForcaApp para que este pare de solicitar um novo palpite após o encerramento do jogo. 
(Atenção: o código contém erro sintático que será corrigido com uso de exceções).

5. Construa uma classe de exceção para representar uma nota inválida (NotaInvalidaException), complemente a classe Avaliacao para que os métodos setNota1 e setNota2 lancem esta exceção se a nota fornecida for menor que 0,0 ou maior que 10,0. 
Modifique o método main da classe AvaliacacaoApp para que tente alterar a nota 1 e, enquanto a exceção estiver sendo lançada, imprima a mensagem "A nota deve estar no intervalo entre 0,0 e 10,0" e solicite novamente a nota. 
Em seguida, faça o mesmo para a nota 2.

6. Defina um classe chamada ValorMinimoParcelaException que será lançada pela classe Venda no método setQtdParcelas quando o valor da parcela for menor que o mínimo (definido através de constante nesta mesma classe). 
Altere a classe PagamentoCompraApp para que solicite uma nova quantidade de parcelas, enquanto o valor fornecido não for suficientemente pequeno.

7. Implemente duas classes de exceções: HoraInvalidaException e MinutoInvalidoException. 
Altere a classe Alarme para que o método construtor lance a exceção HoraInvalidaException se a hora estiver fora do intervalo entre 0 e 23 e lance a exceção MinutoInvalidoException se o minuto estiver fora do intervalo entre 0 e 59. 
Modifique o método main para que o mesmo encerre sua execução se for fornecido um valor inválido para hora ou minuto e que a mensagem correspondente seja impressa ("A hora digitada é inválida" ou "O minuto digitado é inválido").
