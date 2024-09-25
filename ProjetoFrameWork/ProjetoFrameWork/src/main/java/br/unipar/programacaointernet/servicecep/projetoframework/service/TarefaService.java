package br.unipar.programacaointernet.servicecep.projetoframework.service;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Tarefa;
import br.unipar.programacaointernet.servicecep.projetoframework.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> listarTodos() {
        return tarefaRepository.findAll();
    }

    public void salvar(Tarefa tarefa) {
        tarefaRepository.save(tarefa);
    }

    public void remover(Integer id) {
        tarefaRepository.deleteById(id);
    }

    public Tarefa findByDescricao(String descricao) { return tarefaRepository.findByDescricao(descricao);}

    public Tarefa findById(Integer id) {return tarefaRepository.findById(id).orElse(null);}

}
