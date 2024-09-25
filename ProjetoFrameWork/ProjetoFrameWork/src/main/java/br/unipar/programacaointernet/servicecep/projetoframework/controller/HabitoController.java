package br.unipar.programacaointernet.servicecep.projetoframework.controller;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Habito;
import br.unipar.programacaointernet.servicecep.projetoframework.service.HabitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/habitos")
public class HabitoController {

    @Autowired
    private HabitoService habitoService;

    @GetMapping("/listar")
    public List<Habito> listarHabitos() {
        return habitoService.listarTodos();
    }

    @PostMapping("/add")
    public ResponseEntity<String> addHabito(@RequestBody Habito habito) {
        if (habitoService.findByDescricao(habito.getDescricao()) != null) {
            return ResponseEntity.status(409).body("Hábito já existe.");
        }
        habitoService.salvar(habito);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/remove")
    public ResponseEntity<Void> removeHabito(@RequestBody Habito habito) {
        Habito existingHabito = habitoService.findByDescricao(habito.getDescricao());
        if (existingHabito != null) {
            habitoService.remover(existingHabito.getId());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
