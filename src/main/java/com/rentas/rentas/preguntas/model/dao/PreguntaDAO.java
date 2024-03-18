package com.rentas.rentas.preguntas.model.dao;

import com.rentas.rentas.preguntas.model.entity.Pregunta;
import org.springframework.data.repository.CrudRepository;

public interface PreguntaDAO extends CrudRepository<Pregunta, Long> {
}
