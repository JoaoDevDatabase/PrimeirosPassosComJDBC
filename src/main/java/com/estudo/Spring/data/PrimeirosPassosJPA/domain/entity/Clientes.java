package com.estudo.Spring.data.PrimeirosPassosJPA.domain.entity;

import org.springframework.context.annotation.Bean;


public class Clientes {
    private Integer id;
    private String nome;

    public Clientes() {
    }

    public Clientes(String nome) {
        this.nome = nome;
    }

    public Clientes(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
