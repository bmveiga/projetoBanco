package projetoBanco;

public class Conta {

	private String numeroConta;
	private int senha;
	private double saldo;
	private double limite;
	private Banco banco;

	public Conta(String numeroConta, int senha, double saldo, double limite, Banco banco) {
		super();
		this.numeroConta = numeroConta;
		this.senha = senha;
		this.saldo = saldo;
		this.limite = limite;
		this.banco = banco;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public int getSenha() {
		return senha;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public int depositar(double valorDeposito) {
		if(valorDeposito <= 0) {
			return -101;
		}
		
		this.saldo += valorDeposito;
		return 0;
	}
	
	public int sacar(double valorSaque) {
		if(valorSaque <= 0 || valorSaque > this.saldo) {
			return -101;
		}
		
		this.saldo -= valorSaque;
		return 0;
	}


}
