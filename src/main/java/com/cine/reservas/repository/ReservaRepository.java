package com.cine.reservas.repository;

import com.cine.reservas.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservaRepository extends MongoRepository<Reserva, Long> {
    List<Reserva> findByUsuarioId(Long usuarioId);
    List<Reserva> findByPeliculaId(Long peliculaId);
    void deleteById(Long id);
}