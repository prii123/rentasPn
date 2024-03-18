package com.rentas.rentas.clientes.service.implementation;

import com.rentas.rentas.clientes.model.dao.ClienteDAO;
import com.rentas.rentas.clientes.model.entity.Cliente;
import com.rentas.rentas.clientes.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteImpl implements ICliente {
    @Autowired
    private ClienteDAO clienteDAO;
    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Transactional(readOnly = true)
    @Override
    public Cliente findById(Long id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Cliente cliente) {
        clienteDAO.delete(cliente);
    }
}
