package excecoes.exercicios.questao7;

import java.util.Date;
import java.util.GregorianCalendar;

public class Alarme {
	private int hora;
	private int minuto;

	public Alarme(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	public boolean isAgora() {
		GregorianCalendar agora = new GregorianCalendar();
		agora.setTime(new Date());
		return this.hora == agora.get(GregorianCalendar.HOUR_OF_DAY)
				&& this.minuto == agora.get(GregorianCalendar.MINUTE);
	}
}
