package com.cine.reservas.service;

import com.cine.reservas.model.Reserva;
import com.cine.reservas.repository.ReservaRepository;
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

    public List<Reserva> obtenerReservasUsuario(Long id) {
        return reservaRepository.findByUsuarioId(id);
    }

    public List<Reserva> obtenerReservasPelicula(Long id) {
        return reservaRepository.findByPeliculaId(id);
    }

    public Reserva crearReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public void eliminarReserva(Long id) {
        reservaRepository.deleteById(id);
    }
}
