package treinoConta;

public class Conta {
	private String nomeConta;
	private int numeroConta;
	private double saldoConta;
	
	public Conta(String nomeConta, int numeroConta, double depositoInicial) {
		this.nomeConta = nomeConta;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}
	
	public Conta(String nomeConta, int numeroConta) {
		this.nomeConta = nomeConta;
		this.numeroConta = numeroConta;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void deposito(double valorDepositado) {
		saldoConta += valorDepositado;
	}
	
	public void saque(double valorSacado) {
		saldoConta -= valorSacado + 5.0;
	}
	
	public String exibeMensagem() {
		return "Digite o que você quer fazer:"
				+ "\n1 - Depósito"
				+ "\n2 - Saque"
				+ "\n3 - Sair\n";
	}
	
	public String toString() {
		return "Nome da conta: " + nomeConta
				+ "\nNúmero: " + numeroConta
				+ "\nSaldo: " + String.format("%.2f", saldoConta);
	}
}
