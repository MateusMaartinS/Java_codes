package br.unipar.programacaointernet.servicecep.servicecep.dao;

import br.unipar.programacaointernet.servicecep.servicecep.model.Endereco;

import java.util.List;

public interface EnderecoDao {
    void  save(Endereco endereco);
    void update(Endereco endereco);
    void delete(Endereco endereco);
    Endereco FindById(Long id);

    List<Endereco> findAll();
}
