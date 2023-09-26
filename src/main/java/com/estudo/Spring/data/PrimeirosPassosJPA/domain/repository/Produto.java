package com.estudo.Spring.data.PrimeirosPassosJPA.domain.repository;

import com.estudo.Spring.data.PrimeirosPassosJPA.domain.entity.Produtos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Produto {

    public static String INSERT = "insert into produtos (produtos) values (?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Produtos salvar_produtos(Produtos produtos){
        jdbcTemplate.update(INSERT, new Object[]{produtos.getProdutos()});
        return produtos;
    }
}
