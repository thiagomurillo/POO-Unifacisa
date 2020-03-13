package polimorfismo;

public class Gerente extends Funcionario{
	
	private int senha;
	private int numFuncionariosGerenciados;
	
	//sobrescrita, override, overwrite
	@Override
	public double getBonificacao() {
		return 0.2*super.getSalario();
	}
	
	public double getBonificacao(double fator){
		return fator*super.getSalario();
	}
	
	public boolean autentica(int senha){
		if (this.senha == senha) {
		      System.out.println("Acesso Permitido!");
		      return true;
		    } else {
		      System.out.println("Acesso Negado!");
		      return false;
		    }
	}

}
