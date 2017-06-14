package br.com.cielo.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -7838251605608641835L;

	public AutorExistenteException(String mensagem){
		super(mensagem);
	}

	public AutorExistenteException(String mensagem, Throwable causa){
		super(mensagem, causa);
	}
}
