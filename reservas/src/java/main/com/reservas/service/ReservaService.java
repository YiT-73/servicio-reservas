package com.tuempresa.reservas.service;

import com.tuempresa.reservas.model.Reserva;
import com.tuempresa.reservas.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> obtenerReservas() {
        return reservaRepository.findAll();
    }

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }
}