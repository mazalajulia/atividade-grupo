package br.com.senai.infob.surlefond.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.senai.infob.surlefond.models.Endereco;
import br.com.senai.infob.surlefond.services.EnderecoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    public EnderecoService enderecoService;

    @GetMapping("/count")
    public Long count() {
        return enderecoService.count();
    }

    @PostMapping("/salvar")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }
    
    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Integer id) {
        Boolean deletou = enderecoService.delete(id);
        if (deletou) {
            return "Usuário removido com sucesso";
        }
        return "Falha ao remover o usuário";
    }

    @GetMapping("/buscar/{id}")
    public Endereco buscarPorId(@PathVariable Integer id) {
        return enderecoService.buscarPorId(id);
    }

    @GetMapping("/listar")
    public List<Endereco> ListarTodos() {
        return enderecoService.listarTodos();
    }

    @PutMapping("/atualizar/{id}")
    public Endereco atualizar(@PathVariable Integer id, @RequestBody Endereco endereco) {
        if(enderecoService.atualizar(endereco, id)) {
            return endereco;
        }
        return null;
    }

}