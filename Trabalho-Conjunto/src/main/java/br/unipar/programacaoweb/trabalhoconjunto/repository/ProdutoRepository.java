package br.unipar.programacaoweb.trabalhoconjunto.repository;

import br.unipar.programacaoweb.trabalhoconjunto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
