package empregado;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner leitura = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Este programa irá ler nome do funcionário, salário bruto, imposto");
		System.out.println("E irá aplicar um acréscimo e exibir informações atualizadas do funcionário.");
		
		Empregado empregado1 = new Empregado();
		
		System.out.println("Digite o nome do funcionário: ");
		empregado1.nome = leitura.nextLine();
		System.out.println("Digite o salário bruto: ");
		empregado1.salarioBruto = leitura.nextDouble();
		System.out.println("Digite o imposto: ");
		empregado1.imposto = leitura.nextDouble();
	
		System.out.printf("Empregado: %s%n"
				+ "Salário Líquido: %.2f%n", empregado1.nome, empregado1.salarioLiquido());
		
		System.out.print("Digite a porcentagem de acréscimo para o funcionário: %");
		double aumento = leitura.nextDouble();
		empregado1.acrescimo(aumento);
		
		System.out.printf("O funcionário %s recebeu aumento%n"
				+ "O novo valor bruto é: $%.2f%n"
				+ "O valor liquido é: $%.2f", empregado1.nome, empregado1.salarioBruto, empregado1.salarioLiquido());
		
		leitura.close();
	}

}
