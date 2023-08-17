package moeda;

public class Dolares {
	public static double IOF = 6.0;
	public static double cotacao = 3.10;
	
	public static double compraDolares(double dinheiro) {
		double reais = cotacao * dinheiro;
		return reais + reais * (IOF/100);
	}
}
