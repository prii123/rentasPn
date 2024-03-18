package com.rentas.rentas.clientes.service;

import com.rentas.rentas.clientes.model.entity.Cliente;

public interface ICliente
{
    Cliente save(Cliente cliente);

    Cliente findById(Long id);
    void delete(Cliente cliente);
}
