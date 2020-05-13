package provas.googlekeep;

public class Data extends Object{	//equals de Object compara com ==

	private short dia, mes, ano;

	public Data(short dia, short mes, short ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public short getDia() {
		return dia;
	}

	public short getMes() {
		return mes;
	}

	public short getAno() {
		return ano;
	}
	
	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(o instanceof Data) {
			Data d = (Data) o;
			if(dia == d.getDia() && 
				mes == d.getMes() &&
				ano == d.getAno())
				return true;
		}
		
		return false;
	}

}
