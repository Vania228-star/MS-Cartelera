package com.ticketfilms.mscartelera.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Funcion")
@Data
public class Funcion{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "fecha_hora", nullable = false)
    private LocalDateTime fechaHora;

    @Column(name= "sala", nullable = false)
    private String sala;

    @Column(name= "precio_asociado", nullable = false)
    private BigDecimal precioAsociado;

    @Column(name= "tipo_sala", nullable = false)
    private String tipoSala;

    @Column(name= "subtitulada", nullable = false)
    private String subtitulada;

    @ManyToOne
    @JoinColumn(name= "evento_id", nullable = false)
    private Evento evento;
}