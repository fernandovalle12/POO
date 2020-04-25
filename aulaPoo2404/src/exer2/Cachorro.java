package exer2;

public class Cachorro extends Animal {

	public Cachorro(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	public void caminha(int p) {
		System.out.println("Cachorro caminhou: " + p + " passos!");
	}

	public void latir() {
		System.out.println("AUAUAU");
	}
}
