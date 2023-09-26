package com.estudo.Spring.data.PrimeirosPassosJPA;

import com.estudo.Spring.data.PrimeirosPassosJPA.domain.entity.Clientes;
import com.estudo.Spring.data.PrimeirosPassosJPA.domain.entity.Produtos;
import com.estudo.Spring.data.PrimeirosPassosJPA.domain.repository.Cliente;
import com.estudo.Spring.data.PrimeirosPassosJPA.domain.repository.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class PrimeirosPassosJpaApplication {

	@Bean
	public CommandLineRunner runner(@Autowired Cliente cliente){
		return args -> {
			System.out.println("SALVANDO OS SEGUINTES CLIENTES -> \n");

			Clientes clientes = new Clientes(1 ,"JOAO VITOR STELLET");
			cliente.salvar(clientes);

			Clientes clientes2 = new Clientes(2 ,"MARIA FERNANDA DA SILVA");
			cliente.salvar(clientes2);

			List<Clientes> todosclientes = cliente.obtertodos();
			if (todosclientes.isEmpty()){
				System.out.println("NENHUM CLIENTE ENCONTRADO");
			} else {
				todosclientes.forEach(System.out::println);
			}

			System.out.println("\n ATUALIZANDO A LISTA DE CLIENTES");

			todosclientes.forEach(c -> {
				c.setNome(c.getNome() + "NOME ATUALIZADO.");
				cliente.AtualizarClientes(c);
			});
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosJpaApplication.class, args);
	}



}
