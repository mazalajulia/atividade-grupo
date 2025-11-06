package br.com.senai.infob.services;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.senai.infob.models.Usuario;
import br.com.senai.infob.repositories.UsuarioRepository;


public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

 
    public Usuario cadastrarUsuario(Usuario usuario, String confirmarSenha) {
        if (!usuario.getSenha().equals(confirmarSenha)) {
            return null;
        }

        usuarioRepository.save(usuario);
        return usuario;
    }

    public Usuario login(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario == null) {
            System.out.println("Usuário não encontrado!");
            return null;
        }

        if (!usuario.getSenha().equals(senha)) {
            System.out.println("Senha incorreta!");
            return null;
        }

        return usuario;
    }
}
