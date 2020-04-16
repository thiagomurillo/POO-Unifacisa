package provas.uber;

public class Corrida {
	
	private static double precoKm;
	
	private Data dataCorrida;
	private String cliente, inicio, destino;
	private double km;
	
	public Corrida(Data dataCorrida, String cliente, String inicio, String destino, double km) {
		this.dataCorrida = dataCorrida;
		this.cliente = cliente;
		this.inicio = inicio;
		this.destino = destino;
		this.km = km;
	}
	
	public Data getDataCorrida() {
		return dataCorrida;
	} 
	
	public String getCliente() {
		return cliente;
	}
	
	public String getInicio() {
		return inicio;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public double getKm() {
		return km;
	}
	
	public double getCustoCorrida() {
		return km * Corrida.precoKm;
	}
	
	public static void setPrecoKm(double precoKm) {
		Corrida.precoKm = precoKm;
	}
	
	@Override
	public String toString() {
		String output = "";
		output += "Data: "+dataCorrida.getDia()+"/"+dataCorrida.getMes()+"/"+dataCorrida.getAno()+"\n";
		output += "Horário: "+dataCorrida.getHora()+"\n";
		output += "Cliente: "+cliente+"\n";
		output += "De "+inicio+" à "+destino+"\n";
		output += "Valor: "+getCustoCorrida();
		return output;
	}

}
