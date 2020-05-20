package br.com.felipesantos.view;

import br.com.felipesantos.controller.Controller;

public class View {
	
	public static void main(String[] args) {
		View view = new View();
		view.simularCliqueUsuarioParaValidarLogin("admin", "1234");
		
	}
	
	public void simularCliqueUsuarioParaValidarLogin(String usuario, String senha) {
		System.out.println("Simulando o clique de um usuário do sistema para validação de login...");
		Controller controller = new Controller();
		boolean resultado = controller.validarLogin(usuario, senha);
		System.out.println("Validação ok? " + resultado);
	}

}
