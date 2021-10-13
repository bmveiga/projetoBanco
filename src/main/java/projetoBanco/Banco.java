package projetoBanco;

public class Banco {
	
	private String nome;
	private String cnpj;
	private int agencia;
		
	public Banco(String nome, String cnpj, int agencia) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.agencia = agencia;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}
