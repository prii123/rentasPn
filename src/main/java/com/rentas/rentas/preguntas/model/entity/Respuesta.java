package com.rentas.rentas.preguntas.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "respuesta")
public class Respuesta
{
    @Id
    @Column(name = "idRespuesta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRespuesta;
    @Column(name = "idPregunta")
    private Long idPregunta;

    @Column(name = "aniio_gravable")
    private Integer annio_gravable;
    @Column(name = "descripcion")
    private  String descripcion;
    @Column(name = "estado")
    private  Boolean estado;
    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
}
