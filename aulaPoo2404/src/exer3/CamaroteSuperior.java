package exer3;

public class CamaroteSuperior extends VIP {
	public double precoAdicionalCamarote = 100.0;
	public double precoFinalCamarote;
	
	public void retornaPrecoCamaroteSuperior() {
		precoFinalCamarote = this.retornaPrecoVip() + precoAdicionalCamarote;
		System.out.println("O pre�o do ingresso camarote superior � de: R$ " + precoFinalCamarote);
	}
}
