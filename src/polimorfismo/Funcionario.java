package polimorfismo;

public class Funcionario extends PessoaFisica{

	private int salario;	

	protected double getBonificacao(){
		return 0.1*this.salario;
	}
	
	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
}
