package br.unipar.programacaointernet.servicecep.servicecep.util.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerUtil {
    private static EntityManagerFactory emf; // Executa uma vez só durante toda a aplicação

    private static EntityManager em; //cada requisição

    private EntityManagerUtil(){}

    public static EntityManagerFactory getEntityManagerFactory(){
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("HibernateMaven");
            System.out.println("Conexão aberta");
        }
        return emf;
    }
    public static EntityManager getManager(){
        if (em == null || !em.isOpen() ){
            em = emf.createEntityManager();
            System.out.println("entity manager aberta");
        }
        return em;
    }

    public static void closeEntityManagerFactory(){
        if (emf != null && emf.isOpen()){
            emf.close();
            System.out.println("Conexão fechada");
        }
    }
}