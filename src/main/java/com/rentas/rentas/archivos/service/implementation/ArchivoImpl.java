package com.rentas.rentas.archivos.service.implementation;

import com.rentas.rentas.archivos.model.dao.ArchivosDAO;
import com.rentas.rentas.archivos.model.entity.Archivo;
import com.rentas.rentas.archivos.service.IArchivo;
import com.rentas.rentas.preguntas.model.dao.PreguntaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArchivoImpl implements IArchivo {

    @Autowired
    private ArchivosDAO archivosDAO;
    @Override
    public Archivo save(Archivo archivo) {
        return archivosDAO.save(archivo);
    }

    @Override
    public Archivo findById(Long id) {
        return archivosDAO.findById(id).orElse(null);
    }

    @Override
    public void delete(Archivo archivo) {
        archivosDAO.delete(archivo);
    }
}
