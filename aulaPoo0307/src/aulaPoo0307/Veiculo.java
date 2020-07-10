package aulaPoo0307;

public class Veiculo {
	private String Modelo;
	private String Cor;
	private int Ano;
	private int Velocidade;
	private double Tanque;
	private ViagemCarro ViagemCarro;
	
	public Veiculo(String Modelo, String Cor, int Ano, double Tanque) {
		this.setModelo(Modelo);
		this.setCor(Cor);
		this.setAno(Ano);
		this.setVelocidade(0);
		this.setTanque(Tanque);
	}

	public String getModelo() {
		return Modelo;
	}
	
	public String getCor() {
		return Cor;
	}
	
	public int getAno() {
		return Ano;
	}
	
	public int getVelocidade() {
		return Velocidade;
	}
	
	public double getTanque() {
		return Tanque;
	}
	
	public ViagemCarro getViagemCarro() {
		return ViagemCarro;
	}
	
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	public void setCor(String cor) {
		Cor = cor;
	}
	
	public void setAno(int ano) {
		Ano = ano;
	}
	
	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}
	
	public void setTanque(double tanque) {
		Tanque = tanque;
	}
	
	public void setViagemCarro(ViagemCarro viagemCarro) {
		ViagemCarro = viagemCarro;
	}
}
