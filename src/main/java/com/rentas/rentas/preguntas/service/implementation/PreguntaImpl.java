package com.rentas.rentas.preguntas.service.implementation;

import com.rentas.rentas.preguntas.model.dao.PreguntaDAO;
import com.rentas.rentas.preguntas.model.entity.Pregunta;
import com.rentas.rentas.preguntas.service.IPregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PreguntaImpl implements IPregunta
{

    @Autowired
    private PreguntaDAO preguntaDao;

    @Transactional
    @Override
    public Pregunta save(Pregunta pregunta) {
        return preguntaDao.save(pregunta);
    }

    @Transactional
    @Override
    public Pregunta findById(Long id) {
        return preguntaDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Pregunta pregunta) {
        preguntaDao.delete(pregunta);
    }
}
