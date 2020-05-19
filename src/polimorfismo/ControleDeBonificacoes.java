package polimorfismo;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;

	public void registraBonificacao(Funcionario f) {
		//chamada a getBonificacao eh polimorfica
		totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
}
