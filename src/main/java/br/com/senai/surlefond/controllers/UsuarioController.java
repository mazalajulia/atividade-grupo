package br.com.senai.surlefond.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.senai.surlefond.projeto.model.Usuario;
import br.com.senai.surlefond.projeto.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastro")
    public String cadastrar(@RequestBody Usuario usuario, @RequestParam String confirmacaoSenha) {
        try {
            usuarioService.cadastrarUsuario(usuario, confirmacaoSenha);
            return "Usuário cadastrado com sucesso!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    @PostMapping("/login")
    public Usuario login(@RequestParam String email, @RequestParam String senha) {
        return usuarioService.login(usuario);
    }

    @PutMapping("/atualizarUm/{id}")
    public Usuario atualizarUm(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return usuarioService.atualizarUm(usuario, id);
    }
}
