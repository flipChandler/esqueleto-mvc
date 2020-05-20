package br.com.felipesantos.controller;

import br.com.felipesantos.model.Model;

public class Controller {

	public boolean validarLogin(String usuario, String senha) {
		Model model = new Model();
		
		return model.validarLogin(usuario, senha);
	}

}
