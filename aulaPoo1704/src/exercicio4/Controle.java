package exercicio4;

public class Controle {
	Televisao tv;
	
	public void dispositivo(Televisao dispositivo) {
		this.tv = dispositivo;
	}
	
	public void aumentaCanal() {
		tv.setCanal(tv.getCanal() + 1);
		System.out.println("Aumentou o canal");
	}
	
	public void diminuiCanal() {
		tv.setCanal(tv.getCanal() - 1);
		System.out.println("Diminuiu o canal");
	}
	
	public void aumentaVolume() {
		tv.setVolume(tv.getVolume() + 1);
		System.out.println("Aumentou o volume");
	}
	
	public void diminuiVolume() {
		tv.setVolume(tv.getVolume() - 1);
		System.out.println("Diminuiu o volume");
	}

}
