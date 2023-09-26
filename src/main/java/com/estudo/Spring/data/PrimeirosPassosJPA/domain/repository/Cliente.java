package com.estudo.Spring.data.PrimeirosPassosJPA.domain.repository;

import com.estudo.Spring.data.PrimeirosPassosJPA.domain.entity.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class Cliente {

    // ----------------- SCRIPTS SQL ----------------------------
    private static String SELECT_ALL = "SELECT * FROM CLIENTES ";
    private static String INSERT = "insert into clientes (nome) values (?)";
    private static String UPDATE = "update clientes set nome = ? where id = ? ";
    private static String DELETE = "delete from clientes where id = ?";

    // -----------------------------------------------------------

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // ------------- CRIAÇÃO DOS METODOS ----------------------------------
    public void DeletarPorId(Clientes id){
        jdbcTemplate.update(DELETE, new Object[]{id.getId()});
    }

    public void DeletarPorClientes(Clientes clientes){
        jdbcTemplate.update(DELETE, new Object[]{clientes.getId()});
    }
    public Clientes salvar(Clientes cliente){
        jdbcTemplate.update(INSERT, new Object[]{cliente.getNome()});
        return cliente;
    }

    public Clientes AtualizarClientes(Clientes clientes){
        jdbcTemplate.update(UPDATE, new Object[]{clientes.getNome(), clientes.getId()});
        return clientes;
    }

    public List<Clientes> obtertodos(){
        return jdbcTemplate.query(SELECT_ALL, new RowMapper<Clientes>() {
            @Override
            public Clientes mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Clientes(rs.getString("nome"));
            }
        });
    }
}
