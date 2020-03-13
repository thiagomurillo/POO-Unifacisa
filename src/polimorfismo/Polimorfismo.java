
package polimorfismo;

public class Polimorfismo {

	public static void main(String [] args){
		
		Gerente gerente = new Gerente();
		Funcionario funcionario = gerente;
		funcionario.setSalario(1000);
		
		System.out.println(funcionario.getBonificacao());
		
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(1000);
		controle.registra(funcionario1);

		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000);
		controle.registra(funcionario2);

		System.out.println(controle.getTotalDeBonificacoes());
		
		
	}
	
}
