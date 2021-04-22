package com.listagemEnderecos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.listagemEnderecos.model.Usuario;
import com.listagemEnderecos.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@PostMapping(value = "/usuario")
	public ResponseEntity criar(@RequestBody Usuario usuario) {
			try { 
				return new ResponseEntity<Usuario>(usuarioRepository.save(usuario), HttpStatus.CREATED);
			} catch (Exception e) {
				return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
			}
	}
	
	@GetMapping(value = "/usuario/{id}")
	public ResponseEntity listarUsuario(@PathVariable("id") long id) {
		
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		
        if(!usuario.isPresent()) {
            return new ResponseEntity("Usuário " + id +" não encontrado!", HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity(usuario, HttpStatus.OK);		
        }
	}
}
