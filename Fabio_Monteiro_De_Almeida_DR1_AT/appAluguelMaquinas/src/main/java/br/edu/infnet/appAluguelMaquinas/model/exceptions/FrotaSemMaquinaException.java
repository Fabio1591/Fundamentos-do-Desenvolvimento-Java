package br.edu.infnet.appAluguelMaquinas.model.exceptions;

public class FrotaSemMaquinaException extends Exception {

	private static final long serialVersionUID = 1L;

	public FrotaSemMaquinaException(String mensagem) {
		super(mensagem);
	}
}