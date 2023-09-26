package com.estudo.Spring.data.PrimeirosPassosJPA.domain.entity;

public class ItemPedidos {

    private Integer id;
    private Pedidos Item_Produtos_Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pedidos getItem_Produtos_Id() {
        return Item_Produtos_Id;
    }

    public void setItem_Produtos_Id(Pedidos item_Produtos_Id) {
        Item_Produtos_Id = item_Produtos_Id;
    }
}
