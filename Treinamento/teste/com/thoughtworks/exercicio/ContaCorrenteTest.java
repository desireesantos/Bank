package com.thoughtworks.exercicio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.exercicio.ContaCorrente;

public class ContaCorrenteTest {
	
	ContaCorrente contaCorrente;
	
	
	@Before
	public void setUp() throws Exception {
		contaCorrente = new ContaCorrente(298787,new ContaPoupanca(98787687));
	}
	
	
	@Test
	public void saldoInicialcomZero(){
		
		assertEquals(0,0, contaCorrente.saldo() - 300.00);
	}  
   
	
	@Test(expected=IllegalStateException.class)
	public void depositoComValorNegativo(){
		
		assertFalse(contaCorrente.depositar(-900.00));
	}  
	
	
	@Test
	public void verificandoSaldoAposDeposito(){
	
		contaCorrente.depositar(900.00);		
		assertEquals( 1200.00 , contaCorrente.saldo(), 0);
		
	}
	
	
	@Test(expected=IllegalStateException.class)
	public void verificandoDepositoPassandoValorNegativo(){
	
		contaCorrente.depositar(-100.00);		
		assertEquals( 200 , contaCorrente.saldo(), 0);
		
	}
	
	@Test(expected=IllegalStateException.class)
	public void saqueSemCreditonaContaCorrente(){
		
		contaCorrente.sacar(700.00);
		
		
	}
	
	
	@Test(expected=IllegalStateException.class)
	public void quantidaSaqueComValorNegativo(){
		
		contaCorrente.depositar(900.00);
		assertEquals(true, contaCorrente.sacar(-900.00) );
		
	}
	
	
	@Test(expected=IllegalStateException.class)
	public void quantiaSaqueIgualZero(){
		
		contaCorrente.sacar(0);
		
	}
	
	
	
   
}
