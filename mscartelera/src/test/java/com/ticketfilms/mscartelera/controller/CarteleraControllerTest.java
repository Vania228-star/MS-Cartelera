package com.ticketfilms.mscartelera.controller;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.ticketfilms.mscartelera.model.Evento;
import com.ticketfilms.mscartelera.service.EventoService;
import com.ticketfilms.mscartelera.service.FuncionService;

@WebMvcTest(CarteleraController.class)
public class CarteleraControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private EventoService eventoService;

    @MockitoBean
    private FuncionService funcionService;

    @Test
    public void testGetEventosEndpoint() throws Exception{

        Evento evento = new Evento();
        evento.setId(1L);
        evento.setTitulo("Concierto de Rock");

        when(eventoService.listarEventos()).thenReturn(List.of(evento));

        mockMvc.perform(get("/api/cartelera/eventos"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].titulo").value("Concierto de Rock"));

        verify(eventoService, times(1)).listarEventos();
    }
}
