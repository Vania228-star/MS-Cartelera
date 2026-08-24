package com.ticketfilms.mscartelera.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "Evento")
@Data
public class Evento{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "evento_id", nullable = false, unique = true)
    private String eventoid;

    @Column(name= "titulo", nullable = false)
    private String titulo;

    @Column(name= "descripcion", nullable = false)
    private String descripcion;

    @Column(name= "tipo_evento", nullable = false)
    private String tipoEvento;

    @Column(name= "url_imagen", nullable = false)
    private String urlImagen;

    @Column(name= "duracion_minutos", nullable = false)
    private Integer duracionMinutos;

    @Column(name= "clasificacion", nullable = false)
    private String clasificacion;

    @Column(name= "director", nullable = false)
    private String director;

    @Column(name= "estado", nullable = false)
    private String estado;
}