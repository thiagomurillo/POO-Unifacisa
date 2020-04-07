package conteudo;

public class OperacoesComString {

	public static void main(String[] args) {
				
		String nome = "Eduardo de Lucena Falcao";

		// charAt(indice)
		System.out.println("Iniciais: " + nome.charAt(0) + "." + nome.charAt(11) + "." + nome.charAt(18));

		// contains
		System.out.println(nome.contains("Eduardo"));
		System.out.println(nome.contains(" "));
		System.out.println(nome.contains(" de"));
		System.out.println(nome.contains("z"));

		// indexOf
		System.out.println(nome.indexOf("Falcao"));
		System.out.println(nome.indexOf("o"));

		// lastIndexOf
		System.out.println(nome.lastIndexOf("o"));

		// isEmpty
		System.out.println(nome.isEmpty());

		// replace
		System.out.println(nome.replace("Eduardo", "EDUARDO"));
		System.out.println("Nome: "+nome);
		System.out.println(nome.replace(" ", "-"));
		System.out.println("Nome: "+nome);

		// substring
		System.out.println(nome.substring(0, 7));

		// toLowerCase
		System.out.println(nome.toLowerCase());

		// toUpperCase
		System.out.println(nome.toUpperCase());

		System.out.println("########################");
		
		nome = "Eduardo de Lucena Falcao";

		nome = nome.substring(0,7);
		nome = nome.toUpperCase();

		System.out.println(nome);
		

		nome = "Eduardo";
		String sobrenome = "Falcao";

		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(nome + sobrenome);

		nome.concat(sobrenome);
		System.out.println(nome);

		System.out.println("########################");

		String nome1 = "Eduardo";
		String nome2 = "Eduardo";
		String nome3 = new String("Eduardo");

		System.out.println(nome1 == nome2); // true
		System.out.println(nome1 == nome3); // false
		System.out.println(nome1.equals(nome2)); // true
		System.out.println(nome1.equals(nome3)); // true

		nome3 = nome2;

		System.out.println(nome1 == nome3); // true
		System.out.println(nome2 == nome3); // true
		System.out.println(nome1.equals(nome3)); // true
		System.out.println(nome2.equals(nome3)); // true
		
		System.out.println("######################## StringBuilder");
		
		StringBuilder nomeCompleto = new StringBuilder("Eduardo");
		nomeCompleto.append(" de");
		nomeCompleto.append(" Lucena");
		nomeCompleto.append(" Falcao");
		
		System.out.println(nomeCompleto);

	}

}
