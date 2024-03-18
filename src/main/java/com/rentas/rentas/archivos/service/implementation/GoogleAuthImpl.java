package com.rentas.rentas.archivos.service.implementation;

import com.rentas.rentas.archivos.model.dao.GoogleAuthDAO;
import com.rentas.rentas.archivos.model.entity.GoogleAuth;
import com.rentas.rentas.archivos.service.IGoogleAuth;
import com.rentas.rentas.preguntas.model.dao.PreguntaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoogleAuthImpl implements IGoogleAuth {

    @Autowired
    private GoogleAuthDAO googleAuthDAO  ;
    @Override
    public GoogleAuth save(GoogleAuth googleAuth) {
        return null;
    }

    @Override
    public GoogleAuth findById(Long id) {
        return null;
    }

    @Override
    public void delete(GoogleAuth googleAuth) {

    }
}
