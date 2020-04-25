package exer1;

public class Administrativo extends Assistente{

	String turno;
	boolean adicional = false;

	public Administrativo(String nome, int matricula, String turno) {
		super(nome, matricula);
		this.setTurno(turno);
		if (this.getTurno() == "noite") {
			this.setAdicional(true);
		}
	}
	
	private void setAdicional(boolean turno) {
		this.adicional = true;
	}
	
	public boolean getAdicional() {
		return this.adicional;
	}

	private void setTurno(String turno) {
		this.turno = turno;
	}
	
	public String getTurno() {
		return this.turno;
	}	
	
	public void exibeDados() {
		String retorno = "O Assistente Administrativo " + this.getNome() + " tem a matricula " + this.getMatricula() + " , trabalha durante o/a " + this.getTurno();
		
		if (this.getTurno() == "noite") {
			retorno += " portanto recebe bonus";
		}else {
			retorno += " portanto não recebe bonus";
		}
		System.out.println(retorno);
	}
}
