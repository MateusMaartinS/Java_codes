package br.unipar.programacaointernet.servicecep.projetoframework.service;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Tarefa;
import br.unipar.programacaointernet.servicecep.projetoframework.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    // Salva uma nova tarefa ou atualiza uma existente
    public void salvar(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
    }

    // Remove uma tarefa com base no identificador
    public void remover(Tarefa tarefa) {
        if (tarefa.getId() != null) {
            tarefaRepository.deleteById(tarefa.getId());
        } else {
            // Lógica alternativa se necessário
        }
    }
}
