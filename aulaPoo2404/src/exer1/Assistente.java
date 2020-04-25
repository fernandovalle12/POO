package exer1;

public class Assistente extends Funcionario{

	public Assistente(String nome, int matricula) {
		super(nome, matricula);
	}
	
	public void exibeDados() {
		System.out.println("O Assistente " + this.getNome() + " tem a matricula " + this.getMatricula());
	}

}
