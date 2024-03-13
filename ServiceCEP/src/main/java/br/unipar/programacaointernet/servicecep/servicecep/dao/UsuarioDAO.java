package br.unipar.programacaointernet.servicecep.servicecep.dao;

import br.unipar.programacaointernet.servicecep.servicecep.model.Usuario;

import java.util.List;

public interface UsuarioDAO {
    void save(Usuario usario);
    void update(Usuario usuario);


    void delete(Usuario usuario);

    Usuario FindById(Long id);

    List<Usuario> findAll();

}
