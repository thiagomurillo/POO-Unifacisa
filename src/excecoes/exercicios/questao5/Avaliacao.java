package excecoes.exercicios.questao5;

public class Avaliacao {
	private double nota1;
	private double nota2;

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getMedia() {
		return (nota1 + nota2) / 2;
	}
}
