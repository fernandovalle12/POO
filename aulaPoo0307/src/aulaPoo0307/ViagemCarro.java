package aulaPoo0307;

public class ViagemCarro {
	private String Destino;
	private String Origem;
	private int DistTotal;
	private int DistPercorrida;
	private double GastoGasolina;
	
	public ViagemCarro( String Origem, String Destino, int DistTotal) {
		this.setDestino(Destino);
		this.setOrigem(Origem);
		this.setDistTotal(DistTotal);
		this.setDistPercorrida(0);
		this.setGastoGasolina(0);
	}

	public String getDestino() {
		return Destino;
	}
	
	public String getOrigem() {
		return Origem;
	}
	
	public int getDistTotal() {
		return DistTotal;
	}
	
	public int getDistPercorrida() {
		return DistPercorrida;
	}
	
	public double getGastoGasolina() {
		return GastoGasolina;
	}
	
	public void setDestino(String destino) {
		Destino = destino;
	}
	
	public void setOrigem(String origem) {
		Origem = origem;
	}
	
	public void setDistTotal(int distTotal) {
		DistTotal = distTotal;
	}
	
	public void setDistPercorrida(int distPercorrida) {
		DistPercorrida = distPercorrida;
	}
	
	public void setGastoGasolina(double gastoGasolina) {
		GastoGasolina = gastoGasolina;
	}	
}
