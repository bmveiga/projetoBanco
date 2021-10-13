package projetoBanco;

import java.util.Scanner;

public class Interface {

	static Scanner tc = new Scanner(System.in);

	public static void main(String[] args) {
		int menuInicial = 5;
		Banco santander = new Banco("Santander", "998512354-008", 47);
		System.out.println("Bem vindo ao banco " + santander.getNome() + "!");
		Conta conta = new Conta("7897-56", 555 ,0.0, 1000.0, santander);
		
		do {
			System.out.println("Digite 1 para abrir uma conta");
			System.out.println("       2 para acessar sua conta");
			System.out.println("       0 para sair");
			menuInicial = tc.nextInt();

			if (menuInicial == 1) {
				System.out.println("Digite 1 para abrir uma conta de pessoa física");
				System.out.println("       2 para abrir uma conta de pessoa jurídica");
				int menuAbrirConta = tc.nextInt();
				System.out.println("Crie uma senha para sua conta:");
				int senha = tc.nextInt();
				Conta conta1 = new Conta("12345-6", senha,0.0, 1000.0, santander);
				System.out.println("Insira seu nome completo");
				String nome = tc.next();
				System.out.println("Insira seu endereco");
				String endereco = tc.next();
				if(menuAbrirConta ==1) {
					System.out.println("Insira seu cpf");
					String cpf = tc.next();
					System.out.println("Insira seu rg");
					String rg = tc.next();
					Cliente cliente1 = new Cliente(nome, cpf, rg, endereco, conta1);
					System.out.println("Conta criada com sucesso! Bem vindo ao banco " + santander.getNome() + " " + cliente1.getNome() + "!");
				} else if(menuAbrirConta == 2) {
					System.out.println("Insira seu cnpj");
					String cnpj = tc.next();
					Cliente cliente1 = new Cliente(nome, cnpj, endereco, conta1);
					System.out.println("Conta criada com sucesso! Bem vindo ao banco " + santander.getNome() + " " + cliente1.getNome() + "!");
				} else {
					System.out.println("Digite uma opção válida");
				}
			} else if (menuInicial == 2) {
				System.out.println("Digite 1 para depositar");
				System.out.println("       2 para sacar");
				System.out.println("       3 para consultar o extrato");
				int menuAcessarConta = tc.nextInt();
				if(menuAcessarConta == 1) {
					System.out.println("Digite o valor do depósito");
					double deposito = tc.nextDouble();
					conta.depositar(deposito);
				} else if(menuAcessarConta == 2) {
					System.out.println("Digite o valor do saque");
					double saque = tc.nextDouble();
					conta.sacar(saque);
				} else if(menuAcessarConta == 3) {
					System.out.println("Seu saldo é de R$" + conta.getSaldo());
				} else {
					System.out.println("Escolha uma opção válida!");
				}
				
			} else if (menuInicial !=0){
				System.out.println("Digite uma opção válida!");
			}
		} while (menuInicial != 0);
	}


}
