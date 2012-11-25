package com.thoughtworks.exercicio;


import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.exercicio.ContaCorrente;
import com.thoughtworks.exercicio.Usuario;

public class UsuarioTest {

	Usuario usuario;

	@Before
	public void setUp() throws Exception {
		usuario = new Usuario("Anna Paula Martins","876868", new ContaCorrente(90980, new ContaPoupanca(9889797) ) );
	}
	
	@Test(expected=NullPointerException.class)
	public void nomeDoUsuarioNullo(){
		
		usuario = new Usuario(null, "876868", new ContaCorrente(7657657,new ContaPoupanca(9889797)));
	}
	
	@Test(expected=IllegalStateException.class)
	public void nomeDoUsuarioVazio(){
		
		usuario = new Usuario("", "876868", new ContaCorrente(5454354, new ContaPoupanca(9889797)));
	}
	
	@Test(expected=IllegalStateException.class)
	public void nomeDoUsuarioComCaracter(){
		
		usuario = new Usuario("Marcus.mello.santos", "876868", new ContaCorrente(98987,new ContaPoupanca(9889797)));
	}
	
	@Test(expected=IllegalStateException.class)
	public void numeroDaContaComCaracterInvalido(){
		
		usuario = new Usuario("Marcus.mello.santos","876868-0", new ContaCorrente(453545,new ContaPoupanca(9889797)));
	}

}
