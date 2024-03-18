package com.rentas.rentas.clientes.controller;

import com.rentas.rentas.clientes.model.entity.Cliente;
import com.rentas.rentas.clientes.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "api/v1")
public class ClienteController
{
    @Autowired
    private ICliente clienteService;

    @PostMapping(name = "cliente")
    public Cliente create(@RequestBody Cliente cliente)
    {
        return clienteService.save(cliente);
    }

    @PutMapping(name = "cliente")
    public Cliente update(@RequestBody Cliente cliente)
    {
        return clienteService.save(cliente);
    }

    @DeleteMapping(name = "cliente/{id}")
    public void delete(@PathVariable Long id)
    {
        Cliente cliente = clienteService.findById(id);
        clienteService.delete(cliente);
    }

    @GetMapping(name = "cliente/{id}")
    public Cliente showById(@PathVariable Long id)
    {
        return clienteService.findById(id);
    }

}
