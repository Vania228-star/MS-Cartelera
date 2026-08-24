package com.ticketfilms.mscartelera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ticketfilms.mscartelera.model.Funcion;
import java.time.LocalDateTime;


@Repository
public interface FuncionRepository extends JpaRepository<Funcion, Long>{

    List<Funcion> findByEventoId(Long eventoId);

    List<Funcion> findByFechaHoraAfter(LocalDateTime fechaHora);
}