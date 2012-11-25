package com.thoughtworks.exercicio;

public class ContaPoupanca implements UsuarioInterface {

	int numeroDaConta;
	double saldoContaPoupanca;

	public ContaPoupanca(int numeroDaConta) {

		this.saldoContaPoupanca = 0;

		if (numeroDaConta >= 0) {
			this.numeroDaConta = numeroDaConta;
		} else {
			throw new IllegalStateException(
					"Digite o numero da conta poupana corretamente e sem letras");

		}
	}

	public double saldo() {

		return this.saldoContaPoupanca;
	}

	@Override
	public Boolean sacar(double quantiaSaque) {

		if (saldo() > 0 && quantiaSaque > 0 && (quantiaSaque >= saldo() )) {

			return temCreditoParaSacar(quantiaSaque);
		} else {
			throw new IllegalStateException(
					" Quantia para saque inv‡lida, tente corretamente. ");

		}

	}

	private Boolean temCreditoParaSacar(double quantiaSaque) {
		double resultadoSaque = 0;

		resultadoSaque = saldo() - quantiaSaque;

		if (resultadoSaque <= 0) {
			this.saldoContaPoupanca = resultadoSaque;
			return true;
		} else {
			throw new IllegalStateException(
					" N‹o tem crŽdito na conta poupana para o saque solicitado. ");

		}

	}

	@Override
	public Boolean depositar(double quantiaDeposito) {

		if (quantiaDeposito > 0) {

			this.saldoContaPoupanca += quantiaDeposito;
			return true;

		} else {
			throw new IllegalStateException(
					"Digite quantia deposito corretamente. ");

		}
	}

	private int numeroDaConta() {
		return numeroDaConta;
	}




}
