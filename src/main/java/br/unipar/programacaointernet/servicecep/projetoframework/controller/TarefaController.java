package br.unipar.programacaointernet.servicecep.projetoframework.controller;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Habito;
import br.unipar.programacaointernet.servicecep.projetoframework.model.Tarefa;
import br.unipar.programacaointernet.servicecep.projetoframework.repository.TarefaRepository;
import br.unipar.programacaointernet.servicecep.projetoframework.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @PostMapping("/add")
    public void addTarefa(@RequestBody Tarefa tarefa) {
        tarefaService.salvar(tarefa);
    }

    @DeleteMapping("/remove")
    public ResponseEntity<Void> removeTarefa(@RequestBody Tarefa tarefa) {
        Tarefa existingTarefa = tarefaService.findByDescricao(tarefa.getDescricao());
        if (existingTarefa != null) {
            tarefaService.remover(existingTarefa.getId());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
