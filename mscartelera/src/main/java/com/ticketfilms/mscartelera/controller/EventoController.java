package com.ticketfilms.mscartelera.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketfilms.mscartelera.service.EventoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Evento")
@RequiredArgsConstructor
public class EventoController{

    private final EventoService eventoService;
}