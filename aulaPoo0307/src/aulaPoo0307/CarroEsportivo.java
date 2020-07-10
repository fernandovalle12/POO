package aulaPoo0307;

public class CarroEsportivo extends Veiculo {
	
	private boolean Turbo;

	public CarroEsportivo(String Modelo, String Cor, int Ano, double Tanque, boolean turbo) {
		super(Modelo, Cor, Ano, Tanque);
		this.setTurbo(turbo);
	}

	public boolean getTurbo() {
		return Turbo;
	}

	public void setTurbo(boolean turbo) {
		Turbo = turbo;
	}
}
