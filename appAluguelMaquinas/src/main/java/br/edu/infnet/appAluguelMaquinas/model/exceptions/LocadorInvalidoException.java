package br.edu.infnet.appAluguelMaquinas.model.exceptions;

public class LocadorInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public LocadorInvalidoException(String mensagem) {
		super(mensagem);
	}
}