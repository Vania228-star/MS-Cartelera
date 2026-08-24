package com.ticketfilms.mscartelera.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketfilms.mscartelera.model.Evento;
import com.ticketfilms.mscartelera.service.EventoService;
import com.ticketfilms.mscartelera.service.FuncionService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/cartelera")
@RequiredArgsConstructor
public class CarteleraController {
    
    private final EventoService eventoService;
    private final FuncionService funcionService;

    @GetMapping("/eventos")
    public ResponseEntity<List<Evento>> listarEventos(){
        List<Evento> eventos = eventoService.listarEventos();
        return ResponseEntity.ok(eventos);
    }

    @GetMapping("/eventos{id}")
    public ResponseEntity<Evento> obtenerEventoPorId(@PathVariable Long id){
        return eventoService.buscarEventoPorId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

}
    

