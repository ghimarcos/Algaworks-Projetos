package com.algaworks.algafood.jpa;

import org.springframework.context.ApplicationContext;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.Cozinha;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class ExclusaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args); /* Faz a simulação de um aplicativo Spring Web para iniciar e parar na execução*/
		
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);/*Pega um Bean Spring*/
		
		
		Cozinha cozinha = new Cozinha(); /*Instancia a cozinha com ID 1*/
		cozinha.setId(1L);
		
		
		cozinhaRepository.remover(cozinha); /*chama na classe cadastroCozinha o método remover passando as informações a cima que é ID 1*/
	}
}
