package br.unipar.programacaointernet.servicecep.servicecep.util.dao;

import br.unipar.programacaointernet.servicecep.servicecep.util.model.Usuario;
import br.unipar.programacaointernet.servicecep.servicecep.util.util.EntityManagerUtil;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO{

    private EntityManager em = EntityManagerUtil.getManager();

    public UsuarioDAOImpl(EntityManager em){
        this.em = em;
    }

    @Override
    public void save(Usuario usuario) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(usuario);
        transaction.commit();
        System.out.println("Usuário: " + usuario.getNome() + "salvo com sucesso!" );
    }

    @Override
    public void update(Usuario usuario) {

    }

    @Override
    public void delete(Usuario usuario) {

    }

    @Override
    public Usuario findById(Long id) {
        return null;
    }

    @Override
    public List<Usuario> findAll() {
        return null;
    }
}
