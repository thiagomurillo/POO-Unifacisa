package testesunitarios;

public class Calculadora {
	
	public int maior(int a, int b) {
		if(a > b)
			return a;
		else return b;
	}
	
	//int ... nomeVariavel
	//var args
	public int soma(int ... numeros) {
		int res = 0;
		for(int n : numeros) {
			res += n;
		}
		return res;
	}
	
	public int subtrai(int a, int b) {
		return a - b;
	}
	
	public double raizQuadrada(double a) {
		return Math.sqrt(a);
	}
	
	public double media (int ... numeros) {
		return soma(numeros)/numeros.length;
	}
}
