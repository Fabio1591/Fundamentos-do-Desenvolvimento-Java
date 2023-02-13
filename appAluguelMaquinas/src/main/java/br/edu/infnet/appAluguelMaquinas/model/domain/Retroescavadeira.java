package br.edu.infnet.appAluguelMaquinas.model.domain;

import br.edu.infnet.appAluguelMaquinas.model.exceptions.ModeloInvalidoException;
import br.edu.infnet.appAluguelMaquinas.model.exceptions.ValorZeradoException;

public class Retroescavadeira extends Maquina {

	private boolean grande;
	private int tamanho;
	private String marca;

	public Retroescavadeira(String codigo, String nome, float valor, String fabricante) throws ValorZeradoException {
		super(codigo, nome, valor);
		this.marca = fabricante;
	}

	@Override
	public float calcularValoraluguel() throws ModeloInvalidoException {
		
		if(tamanho < 5) {
			throw new ModeloInvalidoException("O tamanho da maquina não está disponivel!");
		}
		
		return this.getValor() + (grande ? 3 : 0) + tamanho * 0.05f;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(grande ? "grande=S" : "grande=N");
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(marca);

		return sb.toString();
	}
	
	public boolean isGelada() {
		return grande;
	}
	public void setGrand(boolean grande) {
		this.grande = grande;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
}