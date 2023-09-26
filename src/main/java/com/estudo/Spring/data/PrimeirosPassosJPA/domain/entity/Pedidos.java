package com.estudo.Spring.data.PrimeirosPassosJPA.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedidos {
    private Integer id;
    private Clientes clientes;
    private LocalDate Data_Pedido;
    private BigDecimal total;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public LocalDate getData_Pedido() {
        return Data_Pedido;
    }

    public void setData_Pedido(LocalDate data_Pedido) {
        Data_Pedido = data_Pedido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
