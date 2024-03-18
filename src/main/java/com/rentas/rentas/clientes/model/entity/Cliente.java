package com.rentas.rentas.clientes.model.entity;

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
@Table(name = "clientes")
public class Cliente implements Serializable
{
    @Id
    @Column(name = "idCliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private  String apellidos;
    @Column(name = "correo")
    private  String correo;
    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
}
