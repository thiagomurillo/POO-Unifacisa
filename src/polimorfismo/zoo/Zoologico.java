package polimorfismo.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	private List<Animal> jaulas;
	
	public Zoologico() {
		jaulas = new ArrayList<Animal>();
				
		Cachorro nero = new Cachorro("Nero" , 6);		
		Cachorro lola = new Cachorro("lola", 2);
		Cavalo furacao = new Cavalo("Furacao", 10);
		Preguica preguica = new Preguica("Arimateia", 5);
		
		jaulas.add(nero);
		jaulas.add(lola);
		jaulas.add(furacao);
		jaulas.add(preguica);
	}
	
	//... é um var args
	public Zoologico(Animal ... animais) {
		jaulas = new ArrayList<Animal>();
		for(Animal a : animais) {
			jaulas.add(a);
		}
	}
	
	public void cutucar() {
		for(Animal animal : jaulas) {
			//chamada de metodo polimorfica
			System.out.println(animal);
			animal.emitirSom();
			
			if(animal instanceof Cachorro) {
				//quando adiciono o casting, eu, enquanto programador
				//declaro que estou ciente dos riscos deste código
				Cachorro c = (Cachorro) animal;
				c.correr();
			} else if(animal instanceof Cavalo) {
				//quando adiciono o casting, eu, enquanto programador
				//declaro que estou ciente dos riscos deste código
				Cavalo c = (Cavalo) animal;
				c.correr();
			} else if(animal instanceof Preguica) {
				//quando adiciono o casting, eu, enquanto programador
				//declaro que estou ciente dos riscos deste código
				Preguica p = (Preguica) animal;
				p.correr();
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Zoologico z = new Zoologico();
		z.cutucar();
	}

}
