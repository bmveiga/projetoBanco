package projetoBanco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContaTest {

	@Test
	public void saldoDeveriaRetornar200() {
		Conta conta = new Conta(null, 0, 0, 0, null);
		conta.depositar(200);
		assertEquals(200.0, conta.getSaldo(), 0.01);
	}

	@Test
	public void depositoDeveriaRetornarErroComEntradaNegativa() {
		Conta conta = new Conta(null, 0, 0, 0, null);
		int deposito = conta.depositar(-200);
		assertEquals(-101, deposito, 0.01);
	}

	@Test
	public void depositoDeveriaRetornarErroComEntradaZerada() {
		Conta conta = new Conta(null, 0, 0, 0, null);
		int deposito = conta.depositar(0);
		assertEquals(-101, deposito, 0.01);
	}

	@Test
	public void saldoDeveriaRetornar100() {
		Conta conta = new Conta(null, 0, 800, 0, null);
		conta.sacar(700);
		assertEquals(100.0, conta.getSaldo(), 0.01);
	}

	@Test
	public void saqueDeveriaRetornarErroAoValorNegativo() {
		Conta conta = new Conta(null, 0, 800, 0, null);
		int saque = conta.sacar(-10);
		assertEquals(-101, saque, 0.01);
	}

	@Test
	public void saqueDeveriaRetornarErroAoTentarSacarValorSuperiorAoSaldo() {
		Conta conta = new Conta(null, 0, 800, 0, null);
		int saque = conta.sacar(800.01);
		assertEquals(-101, saque, 0.01);
	}

}
