package com.thoughtworks.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

	public String nomeDoUsuario;
	private String senha;
	private ContaCorrente contaCorrente;
	

	public Usuario(String nomeUsuario, String senha, ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
		

		if (validarNomeDoUsuario(nomeUsuario)) {
			this.nomeDoUsuario = nomeUsuario;
		} else {

			throw new IllegalStateException(
					"Digite o nome do usu‡rio corretamente ");
		}

		if (validarSenha(senha)) {
			this.senha = senha;
		} else {
			throw new IllegalStateException("Digite a senha corretamente");

		}

	}

	private boolean validarSenha(String validarSenha) {
		Pattern parttern = Pattern.compile("[ö,.<>/?{}\\|]");
		Matcher match = parttern.matcher(validarSenha);
		Boolean senhaComCaracteres = false;
		while (match.find()) {

			senhaComCaracteres = true;
		}

		if (senhaComCaracteres == true) {

			return false;
		} else {

			return true;
		}
	}

	private boolean validarNomeDoUsuario(String nomeUsuario) {
		Pattern parttern = Pattern.compile("[ö0-9,.<>/?{}\\|]");
		Matcher match = parttern.matcher(nomeUsuario);
		Boolean nomeDoUsuarioTemNumero = false;
		while (match.find()) {

			nomeDoUsuarioTemNumero = true;
		}

		if (nomeUsuario == null || nomeUsuario.isEmpty()
				|| nomeDoUsuarioTemNumero == true) {

			return false;
		} else {

			return true;
		}
	}
	

	public String nomeDoUsuario() {
		return nomeDoUsuario;
	}

	public ContaCorrente contaCorrente() {
		return contaCorrente;
	}
	
	private String senha() {
		return senha;
	}


}
