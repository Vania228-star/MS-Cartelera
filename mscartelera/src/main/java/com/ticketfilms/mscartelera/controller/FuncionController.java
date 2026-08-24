package com.ticketfilms.mscartelera.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketfilms.mscartelera.service.FuncionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/Funcion")
@RequiredArgsConstructor
public class FuncionController {
    
    private final FuncionService funcionService;
}
