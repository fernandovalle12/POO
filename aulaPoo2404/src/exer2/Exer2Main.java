package exer2;

public class Exer2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c = new Cachorro("Thor");
		c.latir();
		c.caminha();
		c.caminha(12);
		
		Gato g = new Gato("Zeus");
		g.miar();
		g.caminha();
	}

}
