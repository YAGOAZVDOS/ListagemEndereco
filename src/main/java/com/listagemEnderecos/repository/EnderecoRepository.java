package com.listagemEnderecos.repository;

import org.springframework.stereotype.Repository;

import com.listagemEnderecos.model.Endereco;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
	
}  
