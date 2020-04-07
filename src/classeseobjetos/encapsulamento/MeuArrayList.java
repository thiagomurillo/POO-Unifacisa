package classeseobjetos.encapsulamento;

public class MeuArrayList {
	
	private int[] intArray = new int[10];
	private int tamanho = 0;
	
	
	public int get(int indice) {
		if(indice>=0 && indice < tamanho) {
			return intArray[indice];
		} else{
			throw new ArrayIndexOutOfBoundsException();
		}
		 
	}
	
	//tamanho = 10
	//intArray (893743) 	
	//dobro (893743) [33, 24, 43, 45, 56, 67, 87, 89, 90, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	public void add(int num) {
		if(tamanho == intArray.length) {
			int[] dobro = new int[2*tamanho];
			for(int i = 0; i < tamanho; i++) {
				dobro[i] = intArray[i];
			}
			intArray = dobro;
		}		
		intArray[tamanho] = num;
		tamanho++;
	}
	
	//myArrayList.substituir(15, 98);
	//dobro (893743) [98, 24, 43, 45, 56, 67, 87, 89, 90, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	public boolean substituir(int indice, int num) {
		if(indice>=0 && indice < tamanho) {
			intArray[indice] = num;
			return true;
		} else {
			return false;
		}
	}
	
	//myArrayList.remover(0);
	//dobro (893743) [24, 43, 45, 56, 67, 87, 89, 90, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	public boolean remover(int indice) {
		if(indice>=0 && indice < tamanho) {
			for(int i = indice; i < tamanho - 1; i++) {
				intArray[i] = intArray[i+1];
			}
			tamanho--;
			return true;
		}
		return false;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	@Override
	public String toString() {
		String output = "[ ";
		for(int i = 0; i < tamanho; i++) {
			output += intArray[i]+", ";
		}
		output += "]";
		return output;
	}
}
