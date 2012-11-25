package com.thoughtworks.exercicio;

public class ContaCorrente implements UsuarioInterface {

	int numeroDaConta;
	double saldoContaCorrente;
	ContaPoupanca contaPoupanca;
	
	
	

	public ContaCorrente(int numeroConta, ContaPoupanca contaPoupanca) {

		this.saldoContaCorrente = 300.00;
		
		this.contaPoupanca = contaPoupanca;
		

		if (numeroDaConta >= 0) {
			this.numeroDaConta = numeroConta;
		} else {
			throw new IllegalStateException(
					"Digite o numero da conta corretamente e sem letras");

		}
	}

	public double saldo() {
		
		return this.saldoContaCorrente;
	}

	@Override
	public Boolean sacar(double quantiaSaque) {

		
		if ( saldo() >=  -300  && quantiaSaque > 0  ) {

				return temCreditoParaSacar(quantiaSaque);
		} else {
			throw new IllegalStateException(
					" Quantia para saque inv‡lida, tente corretamente. ");

		}

	}
	
	
	private Boolean temCreditoParaSacar(double quantiaSaque) {
		double resultadoSaque = 0;
   
		resultadoSaque = saldo() - quantiaSaque;

		if (resultadoSaque >= -300.00) {
			this.saldoContaCorrente = resultadoSaque;
			return true;
		} else {
			throw new IllegalStateException(
					" N‹o tem crŽdito na conta corrente para o saque solicitado. ");

		}

	}

	@Override
	public Boolean depositar(double quantiaDeposito) {

		if (quantiaDeposito > 0) {

			this.saldoContaCorrente = saldo() + quantiaDeposito;
			return true;

		} else {
			throw new IllegalStateException(
					"Digite quantia deposito corretamente. ");

		}
	}

}
