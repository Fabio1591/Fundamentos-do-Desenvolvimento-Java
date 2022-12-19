package br.edu.infnet.appAluguelMaquinas.model.domain;

import br.edu.infnet.appAluguelMaquinas.model.exceptions.LocadorInvalidoException;

public class Locador {

	private String nome;
	private String cpf;
	private String email;

	public Locador(String nome, String cpf, String email) throws LocadorInvalidoException {
		
		if(nome == null) {
			throw new LocadorInvalidoException("O nome do solicitante deve ser preenchido!");
		}
		
		if(cpf == null) {
			throw new LocadorInvalidoException("O CPF do solicitante deve ser preenchido!");
		}
		
		if(email == null) {
			throw new LocadorInvalidoException("O e-mail do solicitante deve ser preenchido!");
		}
		
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(email);
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEmail() {
		return email;
	}
}