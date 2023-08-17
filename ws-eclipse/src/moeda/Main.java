package moeda;

import java.util.Locale;
import java.util.Scanner;

// ESSE PROGRAMAMA É AUXILIADO POR CLASSES ESTÁTICAS. REFERENTE AO APRENDIZADO QUE EU TIVE.

public class Main {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.printf("A cotação de dolar atual: %.2f%n", Dolares.cotacao);
		System.out.println("Digite a quantidade de dolares que você quer comprar: ");
		double quantidade = leitura.nextDouble();
		double dindin = Dolares.compraDolares(quantidade);
		System.out.printf("Você irá pagar %.2f em reais.", dindin);

		leitura.close();

	}

}
