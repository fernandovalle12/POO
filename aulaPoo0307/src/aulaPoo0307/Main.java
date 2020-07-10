package aulaPoo0307;

public class Main {

	public static void main(String[] args) {
		Viajar viajar = new Viajar();
		Veiculo Carro1 = new Veiculo ("GOL", "Branco", 2002, (float) 45.0);
		ViagemCarro ViagemCarro1 = new ViagemCarro("Joinville", "Florianopolis", 250); 
		viajar.MarcarViagem(ViagemCarro1, Carro1);
		viajar.viajar(Carro1, false);
		
		
		CarroEsportivo Carro2 = new CarroEsportivo("GOLF", "Vermelho", 2018, (float) 35.0, false);
		ViagemCarro ViagemCarro2 = new ViagemCarro("Joinville", "Florianopolis", 250); 
		viajar.MarcarViagem(ViagemCarro2, Carro2);
		viajar.viajar(Carro2, true);
		
	}
	
}
