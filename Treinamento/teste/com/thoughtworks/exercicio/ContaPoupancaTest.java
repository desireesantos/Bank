package com.thoughtworks.exercicio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.exercicio.ContaCorrente;

public class ContaPoupancaTest {
	
	ContaPoupanca contaPoupanca, contaPoupancaTest;
	
	
	@Before
	public void setUp() throws Exception {
		contaPoupanca = new ContaPoupanca(9879879);
	}
	
	
	  
   
	
	@Test(expected=IllegalStateException.class)
	public void depositoComValorNegativo(){
		
		assertFalse(contaPoupanca.depositar(-700.00));
	}  
	
	
	@Test
	public void verificandoSaldoAposDeposito(){
	
		contaPoupanca.depositar(900.00);		
		assertEquals( 900.00 , contaPoupanca.saldo(), 0);
		
	}
	
	
	@Test(expected=IllegalStateException.class)
	public void verificandoDepositoPassandoValorNegativo(){
	
		contaPoupanca.depositar(-800.00);		
		assertEquals( 800.00 , contaPoupanca.saldo(), 0);
		
	}
	
	@Test(expected=IllegalStateException.class)
	public void saqueSemCreditoContaPoupanca(){
		
		contaPoupanca.sacar(700.00);
		
		
	}
	
	
	
	
	
	
   
}
