package br.com.cielo.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cielo.socialbooks.domain.Autor;

public interface AutoresRepository extends JpaRepository<Autor, Long>{

}
