package arrays;

import java.util.Arrays;

public class CampeonatoFutebol {
	
	String[] times;
	
	//"Treze Campinense Botafogo Autoesporte"
	void adicionarTimes(String times) {
		this.times = times.split(" ");
	}
	
	String[] criarCampeonato() {
		int qtdadeJogos = (this.times.length - 1)*2;
		String[] campeonato = new String[qtdadeJogos];
		
		//for externo
		//iTimeCasa (treze até botafogo)
		//                               
		//"Treze Campinense Botafogo Autoesporte"
		
		//for interno
		//timeForaCasa (timeCasa+1 até autoesporte)
		//                              \/
		//"Treze Campinense Botafogo Autoesporte"
		
		int iCampeonato = 0;
		
		for(int iTimeCasa = 0; iTimeCasa < times.length - 1; iTimeCasa++) {
			String timeCasa = times[iTimeCasa];
			for(int iForaCasa = iTimeCasa+1; iForaCasa < times.length; iForaCasa++) {
				String timeFora = times[iForaCasa];
				
				campeonato[iCampeonato] = timeCasa + " X " + timeFora;
				iCampeonato++;
			}
		}
		
		return campeonato;		
	}
	
	public static void main(String[] args) {
		
		CampeonatoFutebol camp = new CampeonatoFutebol();
		
		camp.adicionarTimes("Treze Campinense Botafogo Autoesporte");
		
		String[] jogos = camp.criarCampeonato();
		System.out.println(Arrays.toString(jogos));
		
	}
}
