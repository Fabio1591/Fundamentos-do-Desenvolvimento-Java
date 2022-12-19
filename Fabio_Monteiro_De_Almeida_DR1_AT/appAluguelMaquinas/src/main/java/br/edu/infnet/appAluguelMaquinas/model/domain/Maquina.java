package br.edu.infnet.appAluguelMaquinas.model.domain;

import br.edu.infnet.appAluguelMaquinas.model.exceptions.ModeloInvalidoException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ValorZeradoException;

public abstract class Maquina {

	private String codigo;
	private String nome;
	private float valor;
	
	public Maquina(String codigo, String nome, float valor) throws ValorZeradoException {
		
		if(valor == 0) {
			throw new ValorZeradoException("O valor invalido!");
		}
		
		if(valor < 0) {
			throw new ValorZeradoException("O valor deve ser positivo!");
		}

		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public abstract float calcularValoraluguel() throws ModeloInvalidoException;

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(codigo);
		sb.append(";");
		sb.append(nome);
		sb.append(";");
		sb.append(valor);

		return sb.toString();
	}

	public String getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public float getValor() {
		return valor;
	}	
}