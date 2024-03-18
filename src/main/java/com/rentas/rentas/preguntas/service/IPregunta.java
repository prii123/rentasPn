package com.rentas.rentas.preguntas.service;

import com.rentas.rentas.preguntas.model.entity.Pregunta;

public interface IPregunta
{
    Pregunta save(Pregunta pregunta);

    Pregunta findById(Long id);
    void delete(Pregunta pregunta);
}
