package br.unipar.programacaointernet.servicecep.projetoframework.repository;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
}
