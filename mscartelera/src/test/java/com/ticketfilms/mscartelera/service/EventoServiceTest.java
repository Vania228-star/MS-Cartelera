package com.ticketfilms.mscartelera.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ticketfilms.mscartelera.model.Evento;
import com.ticketfilms.mscartelera.repository.EventoRepository;

@ExtendWith(MockitoExtension.class)
public class EventoServiceTest {

    @Mock
    private EventoRepository eventoRepository;

    @InjectMocks 
    private EventoService eventoService;

    @Test
    public void testListarEventos(){
        Evento evento = new Evento();
        evento.setId(1L);
        evento.setTitulo("Batman");

        when(eventoRepository.findAll()).thenReturn(List.of(evento));

        List<Evento> eventos = eventoService.listarEventos();

        assertNotNull(eventos);
        assertEquals(1, eventos.size());
        assertEquals("Batman", eventos.get(0).getTitulo());
        verify(eventoRepository, times(1)).findAll();
    }
}
