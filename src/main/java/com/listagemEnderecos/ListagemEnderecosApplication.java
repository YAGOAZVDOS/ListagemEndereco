package com.listagemEnderecos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.listagemEnderecos")
public class ListagemEnderecosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListagemEnderecosApplication.class, args);
	}

}
