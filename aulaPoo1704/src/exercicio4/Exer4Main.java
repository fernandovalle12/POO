package exercicio4;

public class Exer4Main {

	public static void main(String[] args) {

		Televisao tv1 = new Televisao();
		Controle controle1 = new Controle();
		controle1.dispositivo(tv1);
		controle1.aumentaCanal();
		controle1.aumentaVolume();
		System.out.println(tv1.getCanal());
	}

}
