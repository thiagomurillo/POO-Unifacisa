package heranca.versuscomposicao;

//a heranca gera uma ligacao (dependencia) que nunca muda
//Coracao herda todas as variáveis e funções publicas de Orgao
//essa dependencia se dá em tempo de compilação
//nunca mais eu conseguirei modificar detalhes dessa dependência durante
//a execução do programa
public class Coracao extends Musculo{

	public Coracao(double peso, double dimensao, String objetivo) {
		super(peso, dimensao, objetivo);
	}

}
