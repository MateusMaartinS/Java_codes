package br.unipar.programacaointernet.servicecep.servicecep.util.util;

import br.unipar.programacaointernet.servicecep.servicecep.util.dao.UsuarioDAO;
import br.unipar.programacaointernet.servicecep.servicecep.util.dao.UsuarioDAOImpl;
import br.unipar.programacaointernet.servicecep.servicecep.util.model.Usuario;

public class Main {
    public static void main (String[] args){
        try{
            EntityManagerUtil.getEntityManagerFactory();

            UsuarioDAO usuarioDAO = new UsuarioDAOImpl(
                    EntityManagerUtil.getManager());

            Usuario usuario = new Usuario();

            usuario.setNome("Zezinho");
            usuario.setLogin("zezinho123");
            usuario.setSenha("123456");

            usuarioDAO.save(usuario);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
