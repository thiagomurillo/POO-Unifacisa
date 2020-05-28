package polimorfismo;

public class SistemaInterno {
	private double totalDeBonificacoes = 0;

	public void registraBonificacao(Funcionario f) {
		//chamada a getBonificacao eh polimorfica
		totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}
	
	public boolean login(Autenticavel a, int senha) {
		return a.autentica(senha);
	}
}
