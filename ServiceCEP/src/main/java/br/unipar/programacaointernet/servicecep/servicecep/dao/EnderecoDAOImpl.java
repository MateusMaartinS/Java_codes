package br.unipar.programacaointernet.servicecep.servicecep.dao;


import br.unipar.programacaointernet.servicecep.servicecep.model.Endereco;
import br.unipar.programacaointernet.servicecep.servicecep.util.EntityManagerUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class EnderecoDAOImpl implements EnderecoDao {

    private EntityManager em = EntityManagerUtil.getManager();


    public EnderecoDAOImpl(EntityManager manager) {
        this.em = em;
    }


    @Override
    public void save(Endereco endereco) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(endereco);
        transaction.commit();
        System.out.println("Enreco " + endereco.toString() +
                " Salvo Com Sucesso!!");
    }

    @Override
    public void update(Endereco endereco) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(endereco);
        transaction.commit();
        System.out.println("Update " + endereco.toString() +
                " Salvo Com Sucesso!!");

    }

    @Override
    public void delete(Endereco endereco) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(endereco);
        transaction.commit();
        System.out.println("Delete " + endereco.toString() +
                " Salvo Com Sucesso!!");

    }

    @Override
    public Endereco FindById(Long id) {
        return null;
    }

    @Override
    public List<Endereco> findAll() {
        return null;
    }
}
