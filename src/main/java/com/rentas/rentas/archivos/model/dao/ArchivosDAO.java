package com.rentas.rentas.archivos.model.dao;

import com.rentas.rentas.archivos.model.entity.Archivo;
import org.springframework.data.repository.CrudRepository;

public interface ArchivosDAO extends CrudRepository<Archivo, Long> {
}
