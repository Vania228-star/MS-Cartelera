package com.ticketfilms.mscartelera.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ticketfilms.mscartelera.model.Evento;
import com.ticketfilms.mscartelera.repository.EventoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class EventoService {

    private final EventoRepository eventoRepository;

    public List<Evento> listarEventos(){
        return eventoRepository.findAll();
    }

    public Optional<Evento> buscarEventoPorId(Long id){
        return eventoRepository.findById(id);
    }

    public Evento guardarEvento(Evento evento){
        return eventoRepository.save(evento);
    }
}