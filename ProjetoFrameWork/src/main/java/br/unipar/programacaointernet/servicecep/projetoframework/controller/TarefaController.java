package br.unipar.programacaointernet.servicecep.projetoframework.controller;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Tarefa;
import br.unipar.programacaointernet.servicecep.projetoframework.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @PostMapping("/remove")
    public void removeTarefa(@RequestBody Tarefa tarefa) {
        tarefaService.remover(tarefa);
    }
}
