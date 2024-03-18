package com.rentas.rentas.preguntas.controller;

import com.rentas.rentas.preguntas.model.entity.Respuesta;
import com.rentas.rentas.preguntas.service.IRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class RespuestaController
{
    @Autowired
    private IRespuesta respuestaService;

    @PostMapping("respuesta")
    public Respuesta create(@RequestBody Respuesta respuesta)
    {
        return respuestaService.save(respuesta);
    }

    @PutMapping("respuesta")
    public Respuesta update(@RequestBody Respuesta respuesta)
    {
        return respuestaService.save(respuesta);
    }

    @DeleteMapping("respuesta/{id}")
    public void delete(@PathVariable Long id)
    {
        Respuesta respuesta = respuestaService.findById(id);
        respuestaService.delete(respuesta);
    }

    @GetMapping("respuesta/{id}")
    public Respuesta showById(@PathVariable Long id)
    {
        return respuestaService.findById(id);
    }
}
