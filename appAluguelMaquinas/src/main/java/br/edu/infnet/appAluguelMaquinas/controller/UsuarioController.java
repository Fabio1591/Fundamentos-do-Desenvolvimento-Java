package br.edu.infnet.appAluguelMaquinas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appAluguelMaquinas.model.domain.Usuario;


@Controller
public class UsuarioController {
	
	@GetMapping(value ="/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		System.out.println("Inclusão realizada com sucesso: " + usuario);

		return "redirect:/";
	}
	
}
