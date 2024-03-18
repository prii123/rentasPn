package com.rentas.rentas.clientes.model.dao;

import com.rentas.rentas.clientes.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<Cliente, Long> {
}
