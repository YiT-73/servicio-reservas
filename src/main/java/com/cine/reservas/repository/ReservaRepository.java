package com.cine.reservas.repository;

import com.cine.reservas.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservaRepository extends MongoRepository<Reserva, Long> {
}