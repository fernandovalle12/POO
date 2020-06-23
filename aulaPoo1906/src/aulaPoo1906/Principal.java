package aulaPoo1906;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Contato> array = new ArrayList<Contato>();
	static int contador = 0;
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int opcao = 0;
		
		while(opcao < 4) {
			System.out.println("*** MENU DE OPCOES ***");
			System.out.println("1 - Cadastrar novo contato");
			System.out.println("2 - Buscar contato");
			System.out.println("3 - Mostra agenda");
			System.out.println("4 - Sair");
			
			opcao = Integer.parseInt(in.nextLine());
			
			switch(opcao) {
			case 1:
				cadastrarContato();
				break;
			case 2:
				buscaContato();
				break;
			case 3:
				imprimeAgenda();
				break;
			}
		}
		System.out.println("Fim da Execução");
	}

	private static void cadastrarContato() {
		String nome;
		String telefone;

		System.out.println("*** CADASTRO DE CONTATO ***");
		System.out.println(" NOME:");
		nome = in.nextLine();

		System.out.println(" TELEFONE:");
		telefone = in.nextLine();
		
		Contato $objeto = new Contato(nome,telefone);
		
		array.add($objeto);
		contador++;
		System.out.println( nome + " cadastrado com sucesso");
	}
	
	private static void buscaContato() {
		String nome;
		int i = 0;
		
		System.out.println("*** BUSCA ***");
		
		System.out.println("Digite o nome a ser localizado");
		nome = in.nextLine();
		
		while (i<array.size()) {
			if (array.get(i).getNome().equals(nome)) {
				System.out.println("Contato localizado: ");
				System.out.println( "Nome: " + array.get(i).getNome() + " \t| Telefone: " + array.get(i).getTelefone());
			}
			i++;
		}
	}
	
	private static void imprimeAgenda() {
		int i = 0;
		
		System.out.println("*** AGENDA ***");
		
		while (i<array.size()) {
			System.out.println( "Nome: " + array.get(i).getNome() + " \t| Telefone: " + array.get(i).getTelefone());
			i++;
		}
	}
}
