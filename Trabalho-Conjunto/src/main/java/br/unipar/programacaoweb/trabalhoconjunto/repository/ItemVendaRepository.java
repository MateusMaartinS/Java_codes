package br.unipar.programacaoweb.trabalhoconjunto.repository;

import br.unipar.programacaoweb.trabalhoconjunto.model.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, Integer> {
}
