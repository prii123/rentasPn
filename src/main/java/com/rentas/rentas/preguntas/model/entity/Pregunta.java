package com.rentas.rentas.preguntas.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "pregunta")
public class Pregunta implements Serializable
{
    @Id
    @Column(name = "idPregunta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPregunta;

    @Column(name = "aniio_gravable")
    private Integer annio_gravable;

    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private  Boolean estado;
    @Column(name = "orden")
    private  Integer orden;
    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
}
