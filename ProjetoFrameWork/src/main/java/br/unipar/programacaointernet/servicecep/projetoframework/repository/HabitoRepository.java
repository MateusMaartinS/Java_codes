package br.unipar.programacaointernet.servicecep.projetoframework.repository;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Habito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitoRepository extends JpaRepository<Habito, Integer> {
}
