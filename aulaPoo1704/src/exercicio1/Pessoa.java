package exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String nome;
	private LocalDate datNasc;
	private double altura;
	
	
	public String getNome() {
		return nome;
	}
	
	public LocalDate getDatNasc() {
		return datNasc;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDatNasc(LocalDate datNasc) {
		this.datNasc = datNasc;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public int calculateAge() {
		LocalDate dataAtual = LocalDate.now();
		return Period.between(this.datNasc, dataAtual).getYears();
	}
}
