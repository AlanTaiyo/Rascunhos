package retangulo;

import java.util.Locale;
import java.util.Scanner;

import retanguloClasse.Retangulo;

public class Main {

	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo();
		System.out.println("Este programa irá calcular a Area, Perímetro, e a Diagonal de um retângulo.");
		Locale.setDefault(Locale.US);
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite a altura do retângulo: ");
		retangulo1.altura = leitura.nextDouble();
		System.out.println("Digite a largura do retângulo: ");
		retangulo1.largura = leitura.nextDouble();
		System.out.printf("A Área do triângulo é de: %.2f%n", retangulo1.area());
		System.out.printf("O Perímetro do triângulo é de: %.2f%n", retangulo1.perimetro());
		System.out.printf("A Diagonal do triângulo é de: %.2f%n", retangulo1.diagonal());
		
		leitura.close();
		
	}

}
