package br.com.cielo.socialbooks.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.cielo.socialbooks.domain.DetalhesErro;
import br.com.cielo.socialbooks.services.exceptions.AutorExistenteException;
import br.com.cielo.socialbooks.services.exceptions.AutorNaoEncontradoException;
import br.com.cielo.socialbooks.services.exceptions.LivroNaoEncontradoException;

@ControllerAdvice
public class ResouceExceptionHandler {

	@ExceptionHandler(LivroNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleLivroNaoEncontradoException
				(LivroNaoEncontradoException e, HttpServletRequest request){

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404L);
		erro.setTitulo("O livro não pôde ser encontrado");
		erro.setMensagemDesenvolvedor("http://erros.socialbooks.com/404");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

	@ExceptionHandler(AutorExistenteException.class)
	public ResponseEntity<DetalhesErro> handleAutorExistenteException
				(AutorExistenteException e, HttpServletRequest request){

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(409L);
		erro.setTitulo("Autor já existente");
		erro.setMensagemDesenvolvedor("http://erros.socialbooks.com/409");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.CONFLICT).body(erro);
	}

	@ExceptionHandler(AutorNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleAutorNaoEncontradoExceptionException
				(AutorNaoEncontradoException e, HttpServletRequest request){

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404L);
		erro.setTitulo("O autor não pôde ser encontrado");
		erro.setMensagemDesenvolvedor("http://erros.socialbooks.com/404");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<DetalhesErro> handleDataIntegrityViolationException
				(DataIntegrityViolationException e, HttpServletRequest request){

		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(400L);
		erro.setTitulo("Requisição invalida");
		erro.setMensagemDesenvolvedor("http://erros.socialbooks.com/400");
		erro.setTimestamp(System.currentTimeMillis());

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
	}

}
