package polimorfismo;

public class Secretario extends Funcionario{
	
	public String toString() {
		return "Nome: "+ super.getNome()+"\n"
				+ "Cpf: "+ super.getCpf();
	}

}
