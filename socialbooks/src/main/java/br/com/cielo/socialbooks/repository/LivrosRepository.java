package br.com.cielo.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cielo.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{

}
