package polimorfismo.maio13;

import polimorfismo.Cliente;
import polimorfismo.Funcionario;
import polimorfismo.Gerente;
import polimorfismo.Pessoa;
import polimorfismo.Secretario;
import polimorfismo.SistemaInterno;

public class Teste {

	public static void main(String[] args) {
//		Refeicao almoco = new Refeicao();
//		almoco = (Refeicao) new Object();
		
		
		/**
		 * conversão não perigosa pois tenho certeza
		 * que todo gerente é um funcionário
		 * não há chances de class cast exception
		 */
		Gerente g1 = null;
		Funcionario f1 = g1;
		
		/**
		 * conversão perigosa porque nem todo funcionario
		 * eh um gerente
		 */
		Funcionario f2 = new Gerente();
		Gerente g2 = null;
		if(f2 instanceof Gerente)
			g2 = (Gerente) f2;
		
		System.out.println("Funcionou!!");
		
		
		
		
		
		
		
		
		/**
		 * Polimorfismo exemplo 1!
		 */
		
		Gerente g = new Gerente();
		g.setSalario(1000);		
		Funcionario f = g;
		System.out.println(f.getBonificacao());
		
		
		
		
		
		
		
		
		
		/**
		 * Polimorfismo exemplo 2!
		 */
		SistemaInterno cdb = new SistemaInterno();
		Secretario s = new Secretario();
		s.setSalario(1000);
		Gerente gerente = new Gerente();
		gerente.setSalario(1000);
		Funcionario func = new Funcionario();
		func.setSalario(1000);
		
		cdb.registraBonificacao(s);
		cdb.registraBonificacao(gerente);
		cdb.registraBonificacao(func);
		
		System.out.println(cdb.getTotalDeBonificacoes());
		
	}
	
	
	
	
	
	
	
	
	
	
	
//	private static void exibeSalario(Funcionario f) {
//		//nao sei o tipo especifico do objeto
//		//para onde a referencia p está apontando
//		//nao tenho certeza se é do tipo especifico: 
//		//Pessoa, Funcionario, Secretario, Gerente, ou Cliente
//		
//		Gerente g = p;
//		//o que acontece se p aponta para Cliente?
//		//g estaria tentando apontar para o objeto Cliente
//	}
	
	
	
	
	
	
	
	
}

class Refeicao{}
class Calculadora extends Refeicao{}
