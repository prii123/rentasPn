package com.rentas.rentas.preguntas.controller;


import com.rentas.rentas.preguntas.model.entity.Pregunta;
import com.rentas.rentas.preguntas.service.IPregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PreguntasController
{
    @Autowired
    private IPregunta preguntaService;

    @PostMapping("pregunta")
    public Pregunta create(@RequestBody Pregunta pregunta)
    {
        return preguntaService.save(pregunta);
    }

    @PutMapping("pregunta")
    public Pregunta update(@RequestBody Pregunta pregunta)
    {
        return preguntaService.save(pregunta);
    }

    @DeleteMapping("pregunta/{id}")
    public void delete(@PathVariable Long id)
    {
        Pregunta pregunta = preguntaService.findById(id);
        preguntaService.delete(pregunta);
    }

    @GetMapping("pregunta/{id}")
    public Pregunta showById(@PathVariable Long id)
    {
        return preguntaService.findById(id);
    }
}
