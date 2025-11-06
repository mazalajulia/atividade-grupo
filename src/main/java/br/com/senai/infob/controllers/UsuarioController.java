package br.com.senai.infob.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.models.Usuario;
import br.com.senai.infob.services.UsuarioService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    public UsuarioService usuarioService;
    
    
    @PostMapping("/login")
    public Usuario login(@RequestParam String email,@RequestParam String senha) {
        return usuarioService.login(email, senha);
    }
    
    @PostMapping("/cadastro")
    public Usuario cadastro(@RequestBody Usuario usuario, @RequestParam String confirmarSenha) {
        return usuarioService.cadastrarUsuario(usuario, confirmarSenha);
    }


}
