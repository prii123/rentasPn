package com.rentas.rentas.archivos.model.dao;

import com.rentas.rentas.archivos.model.entity.GoogleAuth;
import org.springframework.data.repository.CrudRepository;

public interface GoogleAuthDAO extends CrudRepository<GoogleAuth, Long> {
}
