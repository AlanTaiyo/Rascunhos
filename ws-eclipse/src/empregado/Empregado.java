package empregado;

public class Empregado {
		public String nome;
		public double salarioBruto;
		public double imposto;
		
		public double salarioLiquido() {
			return salarioBruto - imposto;
		}
		public void acrescimo(double porcentagem) {
			salarioBruto = salarioBruto + (salarioBruto * (porcentagem/100));
		}

}
