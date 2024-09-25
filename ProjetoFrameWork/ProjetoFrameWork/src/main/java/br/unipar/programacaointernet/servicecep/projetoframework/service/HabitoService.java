package br.unipar.programacaointernet.servicecep.projetoframework.service;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Habito;
import br.unipar.programacaointernet.servicecep.projetoframework.repository.HabitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitoService {

    @Autowired
    private HabitoRepository habitoRepository;

    public List<Habito> listarTodos() {
        return habitoRepository.findAll();
    }

    public void salvar(Habito habito) {
        habitoRepository.save(habito);
    }

    public void remover(Integer id) {
        habitoRepository.deleteById(id);
    }

    public Habito findByDescricao(String descricao) {
        return habitoRepository.findByDescricao(descricao);
    }
}
