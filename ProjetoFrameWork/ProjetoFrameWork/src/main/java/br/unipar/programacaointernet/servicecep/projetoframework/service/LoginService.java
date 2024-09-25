package br.unipar.programacaointernet.servicecep.projetoframework.service;

import br.unipar.programacaointernet.servicecep.projetoframework.model.Usuario;
import br.unipar.programacaointernet.servicecep.projetoframework.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean autenticar(String email, String senha) {
        Usuario usuarioEncontrado = usuarioRepository.findByEmail(email);
        Usuario senhaEncontrada = usuarioRepository.findBySenha(senha);
        return usuarioEncontrado != null && senhaEncontrada.getSenha().equals(senha);
    }
}
