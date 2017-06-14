package br.com.cielo.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -7838251605608641835L;

	public AutorNaoEncontradoException(String mensagem){
		super(mensagem);
	}

	public AutorNaoEncontradoException(String mensagem, Throwable causa){
		super(mensagem, causa);
	}
}
