package com.ticketfilms.mscartelera.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ticketfilms.mscartelera.model.Funcion;
import com.ticketfilms.mscartelera.repository.FuncionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class FuncionService {

    private final FuncionRepository funcionRepository;

    public List<Funcion> listarFuncionesPorEventos(Long eventoid){
        return funcionRepository.findByEventoId(eventoid);
    }

    public Optional<Funcion> buscarFuncionPorId(Long id){
        return funcionRepository.findById(id);
    }

    public Funcion guardarFuncion(Funcion funcion){
        return funcionRepository.save(funcion);
    }
}