package com.music.survey.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios_estilos")
public class Grafica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "correo", nullable = false)
    private String correo;
    @Column(name = "estilo", nullable = false)
    private String estilo;
}
