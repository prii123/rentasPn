package com.rentas.rentas.preguntas.service;

import com.rentas.rentas.preguntas.model.entity.Pregunta;
import com.rentas.rentas.preguntas.model.entity.Respuesta;

public interface IRespuesta
{
    Respuesta save(Respuesta respuesta);

    Respuesta findById(Long id);
    void delete(Respuesta respuesta);
}
