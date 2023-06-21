package com.music.survey.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios_estilos")
public class Cantidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "estilo", nullable = false)
    private String estilo;
}
