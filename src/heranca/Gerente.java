package heranca;

import classeseobjetos.encapsulamento.ContaCorrente;

public class Gerente extends Funcionario {
	
	private String senha;
	
	public void liberarCredito(int quantia, ContaCorrente c, String senha) {
		if(this.senha.equals(senha)) {
		c.setLimite(c.getLimite()+quantia);
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		if(o instanceof Gerente) {
			Gerente g = (Gerente) o;
			if(senha.equals(g.senha) &&
					super.nome.equals(g.nome) &&
					super.cargaHoraria == g.cargaHoraria &&
					super.id.equals(g.id) &&
					super.salario == g.salario) {
				return true;
			}
		}
		
		return false;
	}

}
