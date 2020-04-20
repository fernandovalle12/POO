package exercicio2;

public class Elevador {
	int quantidadeMax;
	int quantidade = 0;
	int andarMax;
	int andar = 0;
	
	public Elevador(int qtMax, int andMax) {
		this.quantidadeMax = qtMax;
		this.andarMax = andMax;
	}
	public int getQtMax() {
		return this.quantidadeMax;
	}
	public int getQtPessoas() {
		return this.quantidade;
	}
	public int getAndarMax() {
		return this.andarMax;
	}
	public int getAndar() {
		return this.andar;
	}

	public void sobe() {
		if (this.getAndar() < this.getAndarMax()) {
			this.andar += 1;
			System.out.println("Subiu");
		}
	}

	public void desce() {
		if (this.getAndar() >= 0) {
			this.andar -= 1;
			System.out.println("Desceu");
		}
	}
	
	public void entra() {
		if (this.quantidade < this.quantidadeMax) {
			this.quantidade += 1;
			System.out.println("Entrou");
		}
	}
	
	public void sai() {
		if (this.quantidade > 0) {
			this.quantidade -= 1;
			System.out.println("Saiu");
		}
	}
}
