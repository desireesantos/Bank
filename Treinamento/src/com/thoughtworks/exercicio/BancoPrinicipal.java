package com.thoughtworks.exercicio;

public class BancoPrinicipal {

	public static void main(String[] args) {
		Usuario cliente;
		ContaCorrente contaCorrente;
		

		contaCorrente = new ContaCorrente(989898, new ContaPoupanca(876545));
		cliente = new Usuario("Paula", "886500", contaCorrente);
		
		cliente.contaCorrente().depositar(300.00);
		cliente.contaCorrente().sacar(200.00);
			if (cliente.contaCorrente().saldo() >= 0) {
	
				System.out.println( cliente.nomeDoUsuario() +  " o seu saldo da conta corrente: "
						+ cliente.contaCorrente().saldo());
	
			} else {
	
				System.out.println("Saldo devedor da conta corrente : "
						+ cliente.contaCorrente().saldo());
			}
			
		
		cliente.contaCorrente().contaPoupanca.depositar(300.00);
		cliente.contaCorrente().contaPoupanca.sacar(300.00);
		
		if (cliente.contaCorrente().contaPoupanca.saldo() >= 0) {
			
			System.out.println( cliente.nomeDoUsuario() +  " o seu saldo da conta poupança: "
					+ cliente.contaCorrente().contaPoupanca.saldo());

		} else {

			System.out.println("Saldo devedor da conta poupança : "
					+ cliente.contaCorrente().contaPoupanca.saldo());
		}
		

		

	}

}
