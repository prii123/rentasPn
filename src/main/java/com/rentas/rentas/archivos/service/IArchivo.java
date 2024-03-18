package com.rentas.rentas.archivos.service;

import com.rentas.rentas.archivos.model.entity.Archivo;
import com.rentas.rentas.archivos.model.entity.GoogleAuth;

public interface IArchivo
{
    Archivo save(Archivo archivo);

    Archivo findById(Long id);
    void delete(Archivo archivo);
}
