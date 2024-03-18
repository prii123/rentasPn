package com.rentas.rentas.archivos.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "google_auth")
public class GoogleAuth implements Serializable
{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usuarioId")
    private Integer usuarioId;

    @Column(name = "clientId")
    private String clientId;

    @Column(name = "clientSecret")
    private String clientSecret;

    @Column(name = "redirectUrl")
    private String redirectUrl;

    @Column(name = "accesToken")
    private String accesToken;

    @Column(name = "refreshToken")
    private String refreshToken;

}
