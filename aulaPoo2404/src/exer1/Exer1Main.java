package exer1;

public class Exer1Main {

	public static void main(String[] args) {
		Tecnico t1 = new Tecnico("Jose", 123, 10.4);
		t1.exibeDados();
		
		Administrativo a1 = new Administrativo("Pedro", 112, "noite");
		a1.exibeDados();
	}

}
