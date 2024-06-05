package br.unipar.programacaoweb.trabalhoconjunto.repository;

import br.unipar.programacaoweb.trabalhoconjunto.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {
}
