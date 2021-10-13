package projetoBanco;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String cnpj;
	private String rg;
	private String endereco;
	private Conta conta;
	
	public Cliente(String nome, String cpf, String rg, String endereco, Conta conta) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setEndereco(endereco);
		setConta(conta);
	}
	public Cliente(String nome, String cnpj, String endereco, Conta conta) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setEndereco(endereco);
		setConta(conta);
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
