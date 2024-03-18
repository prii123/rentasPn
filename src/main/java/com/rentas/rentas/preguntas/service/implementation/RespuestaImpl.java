package com.rentas.rentas.preguntas.service.implementation;

import com.rentas.rentas.preguntas.model.dao.RespuestaDAO;
import com.rentas.rentas.preguntas.model.entity.Respuesta;
import com.rentas.rentas.preguntas.service.IRespuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaImpl implements IRespuesta
{

    @Autowired
    private RespuestaDAO respuestaDao;

    @Override
    public Respuesta save(Respuesta respuesta) {
        return respuestaDao.save(respuesta);
    }

    @Override
    public Respuesta findById(Long id) {
        return respuestaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Respuesta respuesta) {
        respuestaDao.delete(respuesta);
    }
}
