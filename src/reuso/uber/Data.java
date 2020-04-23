package reuso.uber;

import java.util.Calendar;
import java.util.Date;

public class Data {
	
	private int dia, mes, ano;
	private int hora, minuto, segundo;
	
	public Data() {
		super();
		Date today = new Date(); 
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);		

		this.dia = cal.get(Calendar.DAY_OF_MONTH);
		this.mes = cal.get(Calendar.MONTH); 
		this.ano = cal.get(Calendar.YEAR);
		
		this.hora = cal.get(Calendar.HOUR);
		this.minuto = cal.get(Calendar.MINUTE);
		this.segundo = cal.get(Calendar.SECOND);
	}
	
	@Override
	public String toString() {
		String output = "";
		output += hora+":"+minuto+":"+segundo+" "+dia+"/"+mes+"/"+ano;
		return output;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	

}
