package br.edu.infnet.appAluguelMaquinas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@GetMapping(value ="/")
	public String telaIndex() {
		return "index";
	}
	
}
