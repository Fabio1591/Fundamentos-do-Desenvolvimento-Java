package br.edu.infnet.appAluguelMaquinas.model.exceptions;

public class ValorZeradoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ValorZeradoException(String mensagem) {
		super(mensagem);
	}
}