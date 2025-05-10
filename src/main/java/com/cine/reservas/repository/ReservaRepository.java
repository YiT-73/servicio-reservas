package com.cine.reservas.repository;

import com.cine.reservas.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {
    List<Reserva> findByUsuarioId(Long usuarioId);
    List<Reserva> findByPeliculaId(Long peliculaId);
}