package br.unipar.programacaointernet.servicecep.projetoframework.repository;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

    // Método para deletar uma tarefa com base na descrição
    void deleteByDescricao(String descricao);
}
