package heranca;

import classeseobjetos.encapsulamento.ContaCorrente;

public class Gerente extends Funcionario {
	
	private String senha;
	
	public void liberarCredito(int quantia, ContaCorrente c, String senha) {
		if(this.senha.equals(senha)) {
		c.setLimite(c.getLimite()+quantia);
		}
	}

}
