package exer3;

public class VIP extends Ingresso {
	public double valorAdicional = 20.0;
	public double precoFinal;
	
	public void mostraPrecoVip() {
		this.retornaPrecoVip();
		System.out.println("O pre�o do ingresso vip �: R$ " + precoFinal);
	}
	
	public double retornaPrecoVip() {
		return precoFinal = preco + valorAdicional;
	}
}
