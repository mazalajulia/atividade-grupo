package br.com.senai.surlefond.services;

import org.springframework.stereotype.Service;
import br.com.senai.surlefond.projeto.model.Usuario;

@Service
public class UsuarioService {

    public void validarSenhas(String senha, String confirmacaoSenha) {
        if (senha == null || confirmacaoSenha == null) {
            throw new IllegalArgumentException("As senhas não podem ser nulas.");
        }
        if (!senha.equals(confirmacaoSenha)) {
            throw new IllegalArgumentException("As senhas não coincidem!");
        }
    }

    public Usuario cadastrarUsuario(Usuario usuario, String confirmacaoSenha) {
        validarSenhas(usuario.getSenha(), confirmacaoSenha);
        return usuario;
    }

        public Usuario login(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

        public Usuario atualizarUm(Usuario usuario, Integer id) {
        Usuario p = buscarPorId(id);
        if (p != null) {
            return usuarioRepository.save(usuario);
        }
        return null;
    }
}

