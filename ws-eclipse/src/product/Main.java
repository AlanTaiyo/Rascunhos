package product;

import java.util.Locale;
import java.util.Scanner;

import productClass.Produto;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Produto Product = new Produto();
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Você irá cadastrar um produto novo.");
		System.out.println("Digite o nome do produto A: ");
		String nome = leitura.nextLine();
		System.out.println("Digite o preço do produto A: ");
		double preco = leitura.nextDouble();
		System.out.println("Digite a quantidade do produto A: ");
		int quantidade = leitura.nextInt();
		Produto Produto = new Produto(nome, preco, quantidade);
		
		Produto.setNome("Computer");
		System.out.println("INFORMAÇÃO ATUALIZADA, NOME: " + Produto.getNome()); //MÉTODOS GET, SET
		System.out.println(Produto);	
		
		System.out.println("Digite a quantidade que você quer adicionar de produto: ");
		quantidade = leitura.nextInt();
		Produto.adicionarProduto(quantidade);
		
		System.out.println();
		System.out.println("INFORMAÇÃO ATUALIZADA:");
		System.out.println(Produto);
		System.out.println();
		
		System.out.println("Digite a quantidade que você quer remover de produto: ");
		quantidade = leitura.nextInt();
		Produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("INFORMAÇÃO ATUALIZADA:");
		System.out.println(Produto);
		System.out.println();
		
		leitura.close();
	}

}
