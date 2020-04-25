package exer1;

public class Funcionario {
	String nome;
	int matricula;
	
	public Funcionario(String nome, int matricula) {
		this.setNome(nome);
		this.setMatricula(matricula);
	}
	
	public void exibeDados() {
		System.out.println("O Funcionario " + this.getNome() + " tem a matricula " + this.getMatricula());
	}
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	protected String getNome() {
		return this.nome;
	}
	
	protected int getMatricula() {
		return this.matricula;
	}
}
