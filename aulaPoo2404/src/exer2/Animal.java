package exer2;

public class Animal {
	public String nome;
	public String raca;
	
	public Animal(String n) {
		nome = n;
	}
	
	public Animal(String n, String r) {
		nome = n;
		raca = r;
	}
	
	public void caminha() {
		System.out.println("O seu animal caminhou");
	}
}
