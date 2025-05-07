package com.tuempresa.reservas.repository;

import com.tuempresa.reservas.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}