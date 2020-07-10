package aulaPoo0307;

public class Validator {
	public void validators(Veiculo veiculo, boolean esportivo) {
		if(esportivo == true) this.validaEsportivo(veiculo);
		else this.validaVeiculo(veiculo);
	}

	private void validaVeiculo(Veiculo veiculo) {
		if (veiculo.getViagemCarro().getDistPercorrida() <= 50) {
			veiculo.setVelocidade(80);
		} else if (veiculo.getViagemCarro().getDistPercorrida() > 80 && veiculo.getViagemCarro().getDistPercorrida() <= 130 ) {
			veiculo.setVelocidade(130);
		} else {
			veiculo.setVelocidade(110);
		}
		this.atualizaTanque(veiculo);
	}

	private void validaEsportivo(Veiculo veiculo) {
		int multiplicador = 1;

		if (veiculo.getViagemCarro().getDistPercorrida() >= 100 && veiculo.getViagemCarro().getDistPercorrida() <= 130) {
			multiplicador = 2;
		}
		
		this.validaERetonaVelocidade(veiculo);
		this.atualizaTanque(veiculo, multiplicador);
		
		
	}

	private void validaERetonaVelocidade(Veiculo veiculo) {
		if (veiculo.getViagemCarro().getDistPercorrida() <= 50) {
			veiculo.setVelocidade(80);
		} else if (veiculo.getViagemCarro().getDistPercorrida() > 50 && veiculo.getViagemCarro().getDistPercorrida() <= 150 ) {
			veiculo.setVelocidade(130);
		} else {
			veiculo.setVelocidade(100);
		}
	}
	
	private void atualizaTanque(Veiculo veiculo) {
		if (veiculo.getVelocidade() <= 80) {
			veiculo.setTanque(veiculo.getTanque() - 0.2);
			veiculo.getViagemCarro().setGastoGasolina(veiculo.getViagemCarro().getGastoGasolina() + 0.2);
		} else if (veiculo.getVelocidade() > 80 && veiculo.getVelocidade()  <= 120) {
			veiculo.setTanque(veiculo.getTanque() - 0.1);
			veiculo.getViagemCarro().setGastoGasolina(veiculo.getViagemCarro().getGastoGasolina() + 0.1);
		} else {
			veiculo.setTanque(veiculo.getTanque() - 0.4);
			veiculo.getViagemCarro().setGastoGasolina(veiculo.getViagemCarro().getGastoGasolina() + 0.4);
		}
	}
	
	private void atualizaTanque(Veiculo veiculo, int multiplicador) {
		if (veiculo.getVelocidade() <= 80) {
			veiculo.setTanque(veiculo.getTanque() - (0.4 * multiplicador));
			veiculo.getViagemCarro().setGastoGasolina(veiculo.getViagemCarro().getGastoGasolina() + (0.4 * multiplicador));
		} else if (veiculo.getVelocidade() > 80 && veiculo.getVelocidade() <= 120) {
			veiculo.setTanque(veiculo.getTanque() - (0.3 * multiplicador));
			veiculo.getViagemCarro().setGastoGasolina(veiculo.getViagemCarro().getGastoGasolina() + (0.3 * multiplicador)); 
		} else {
			veiculo.setTanque(veiculo.getTanque() - (0.6 * multiplicador));
			veiculo.getViagemCarro().setGastoGasolina(veiculo.getViagemCarro().getGastoGasolina() + (0.6 * multiplicador));
		}
		
	}
	
	
}
