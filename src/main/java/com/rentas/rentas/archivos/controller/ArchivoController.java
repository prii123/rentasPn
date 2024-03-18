package com.rentas.rentas.archivos.controller;

import com.rentas.rentas.archivos.model.entity.Archivo;
import com.rentas.rentas.archivos.service.IArchivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ArchivoController
{
    @Autowired
    private IArchivo archivoService;

    @PostMapping("archivo")
    public Archivo create(@RequestBody Archivo archivo)
    {
        return archivoService.save(archivo);
    }

    @PutMapping("archivo")
    public Archivo update(@RequestBody Archivo archivo)
    {
        return archivoService.save(archivo);
    }

    @DeleteMapping("archivo/{id}")
    public void delete(@PathVariable Long id)
    {
        Archivo archivo = archivoService.findById(id);
        archivoService.delete(archivo);
    }

    @GetMapping("archivo/{id}")
    public Archivo showById(@PathVariable Long id)
    {
        return archivoService.findById(id);
    }
}
