package br.com.cielo.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cielo.socialbooks.domain.Comentario;

public interface ComentariosRepository  extends JpaRepository<Comentario, Long>{

}
