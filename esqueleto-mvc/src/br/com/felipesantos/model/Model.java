package br.com.felipesantos.model;

public class Model {
	private String usuario = "admin";
	private String senha = "1234";

	public boolean validarLogin(String usuario, String senha) {
		
		return this.usuario.equalsIgnoreCase(usuario) && this.senha.equalsIgnoreCase(senha) ? true : false;
	}

}
