package br.com.cielo.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -7838251605608641835L;

	public LivroNaoEncontradoException(String mensagem){
		super(mensagem);
	}

	public LivroNaoEncontradoException(String mensagem, Throwable causa){
		super(mensagem, causa);
	}
}
