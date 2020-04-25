package exer1;

public class Tecnico extends Assistente{
	
	double bonusSalarial;

	public Tecnico(String nome, int matricula, double bonus) {
		super(nome, matricula);
		this.setBonus(bonus);
	}

	private void setBonus(double bonus) {
		this.bonusSalarial = bonus;		
	}
	
	public double getBonus() {
		return this.bonusSalarial;
	}
	
	public void exibeDados() {
		String retorno = "O Assistente Tecnico " + this.getNome() + " tem a matricula " + this.getMatricula() + " e possui bonus de " + this.getBonus();		
		System.out.println(retorno);
	}

}
