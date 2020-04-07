package strings;

import java.util.Arrays;

public class StringUtils {
	
	//frase = "O doce perguntou para o doce, qual o doce mais doce?"
	//subPalavra = "doce"
	//debug: F6 vai para a próxima linha
	static int[] ocorrencias(String frase, String subPalavra) {
		int[] ocorrencias = new int[10];
		int iOcorrencia = 0;
		
		char inicial = subPalavra.charAt(0);
		int tamSubPalavra = subPalavra.length();
		char[] fraseChar = frase.toCharArray();
		for(int i = 0; i < fraseChar.length; i++) {
			if(fraseChar[i] == inicial) {
				String subPalvaraPesquisada = "";
				int j = 0;
				for(j = i; j < i + tamSubPalavra; j++) {
					subPalvaraPesquisada += fraseChar[j];
				}
				if(subPalavra.equals(subPalvaraPesquisada) &&
						(fraseChar[j] == ' ' ||
						fraseChar[j] == ',' ||
						fraseChar[j] == '.' ||
						fraseChar[j] == ';' ||
						fraseChar[j] == '?')) {
					ocorrencias[iOcorrencia] = i;
					iOcorrencia++;
				}
			}			
		}
		
		return ocorrencias;
	}
	
	public static void main(String[] args) {
		int[] ocorrencias = StringUtils.ocorrencias("O doce perguntou para o doce, qual o doce mais doce?", "doce");
		System.out.println(Arrays.toString(ocorrencias));
	}

}
