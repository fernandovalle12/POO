package exercicio;
import javax.swing.JOptionPane;


public class MainClass {

	public static void main(String[] args) {
		String qtdCompra = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
		int count = Integer.parseInt(qtdCompra);
		
		CD[] CDs = new CD[count];
		double[] preco;
		preco = new double[count];
		double total = 0;
		
		for (int i = 0; i < CDs.length; i++) {
			String cDNome = JOptionPane.showInputDialog("Digite o nome do CD:");
			String cDPreco = JOptionPane.showInputDialog("Digite o Preço:");
			String cDArtista = JOptionPane.showInputDialog("Digite o Artista:");
			
			CDs[i] = new CD(cDNome, Integer.parseInt(cDPreco), cDArtista); 
			String vQtd = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
			preco[i] = CDs[i].compraCD(Integer.parseInt(vQtd)); 
		}
		
		
		for(int i = 0; i < CDs.length; i ++) {
			System.out.println(CDs[i].nome);
		}
		
		for (int a = 0; a < preco.length; a++) {
			System.out.println("Comprado CD " + CDs[a].nome + " por R$" + preco[a]);
		}
		
		for (int a = 0; a < preco.length; a++) {
			total += preco[a];
		}
		
		System.out.println("Total de R$" + total);
			
	}

}
