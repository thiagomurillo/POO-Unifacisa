package heranca;

public class Main {
	
	public static void main(String[] args) {
		
		descobrirProfissao(new Gerente());
		descobrirProfissao(new Secretario());
		
	}
	
	public static void descobrirProfissao(Funcionario f) {
		if(f instanceof Gerente)
			System.out.println("Eh gerente!");
		else if(f instanceof Secretario)
			System.out.println("Eh secretario!");
	}

}
