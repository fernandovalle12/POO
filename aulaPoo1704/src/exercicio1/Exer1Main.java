package exercicio1;

import java.time.LocalDate;

public class Exer1Main {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Fernando");
		pessoa.setAltura(1.90);
		pessoa.setDatNasc(LocalDate.of(2000, 02, 12));
		
		System.out.println("Sua idade é: " + pessoa.calculateAge());
	}


}
