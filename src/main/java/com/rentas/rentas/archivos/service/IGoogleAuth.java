package com.rentas.rentas.archivos.service;

import com.rentas.rentas.archivos.model.entity.GoogleAuth;
import com.rentas.rentas.preguntas.model.entity.Pregunta;

public interface IGoogleAuth
{
    GoogleAuth save(GoogleAuth googleAuth);

    GoogleAuth findById(Long id);
    void delete(GoogleAuth googleAuth);
}
