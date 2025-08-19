package br.com.leonardo.forumhub.repositories;

import br.com.leonardo.forumhub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
