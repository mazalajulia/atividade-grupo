package br.com.senai.infob.surlefond.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.infob.surlefond.models.Endereco;



@Repository
public interface  EnderecoRepository  extends JpaRepository<Endereco, Integer>  {

}
