package aulaPoo0307;

public class Viajar extends Validator{
	
	public void MarcarViagem(ViagemCarro viagemCarro, Veiculo veiculo) {
		veiculo.setViagemCarro(viagemCarro);
	}
	
	public void viajar(Veiculo veiculo, boolean esportivo) {
		int a = 0;
		
		while (a < veiculo.getViagemCarro().getDistTotal()) {
			this.RodarKm(veiculo, esportivo);
			a = a+1;
		}
		this.terminaViagem(veiculo);
	}
	
	public void RodarKm(Veiculo veiculo, boolean esportivo) {		
		validators(veiculo, esportivo);
		veiculo.getViagemCarro().setDistPercorrida(veiculo.getViagemCarro().getDistPercorrida() + 1);
		
		if (veiculo.getTanque() < 5.0) {
			veiculo.setTanque(esportivo ? 35.0 : 45.0);
			System.out.println(veiculo.getModelo() + " abastecido no kilometro " + veiculo.getViagemCarro().getDistPercorrida());
		}
		
	}

	
	public void terminaViagem(Veiculo veiculo) {
		System.out.println(veiculo.getModelo() + " chegou a " + veiculo.getViagemCarro().getDestino());
		System.out.println("Combustivel restante: " + (float) veiculo.getTanque());
		System.out.println("Combustivel gasto: " +  (float) veiculo.getViagemCarro().getGastoGasolina());
	}
}
