package com.listagemEnderecos.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.listagemEnderecos.model.Endereco;
import com.listagemEnderecos.repository.EnderecoRepository;

@RestController
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@PostMapping(value = "/endereco")
	public ResponseEntity criar(@RequestBody Endereco endereco) {
		try {
			return new ResponseEntity<Endereco>(enderecoRepository.save(endereco), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
		}

	}
	
}
