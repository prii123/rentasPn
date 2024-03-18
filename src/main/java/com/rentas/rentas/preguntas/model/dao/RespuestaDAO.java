package com.rentas.rentas.preguntas.model.dao;


import com.rentas.rentas.preguntas.model.entity.Respuesta;
import org.springframework.data.repository.CrudRepository;

public interface RespuestaDAO extends CrudRepository<Respuesta, Long> {
}
