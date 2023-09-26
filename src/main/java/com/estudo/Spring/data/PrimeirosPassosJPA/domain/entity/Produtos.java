package com.estudo.Spring.data.PrimeirosPassosJPA.domain.entity;


import java.math.BigDecimal;

public class Produtos {
    private Integer id;
    private String Produtos;
    private BigDecimal Quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdutos() {
        return Produtos;
    }

    public void setProdutos(String produtos) {
        Produtos = produtos;
    }

    public BigDecimal getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        Quantidade = quantidade;
    }
}
