package com.cine.reservas.controller;

import com.cine.reservas.model.Reserva;
import com.cine.reservas.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/all")
    public List<Reserva> getReservas() {
        return reservaService.obtenerReservas();
    }

    @GetMapping("/usuario/{id}")
    public List<Reserva> getReservasUsuario(@PathVariable Long id) {
        return reservaService.obtenerReservasUsuario(id);
    }

    @GetMapping("/pelicula/{id}")
    public List<Reserva> getReservasPelicula(@PathVariable Long id) {
        return reservaService.obtenerReservasPelicula(id);
    }
    @PostMapping
    public Reserva crearReserva(@RequestBody Reserva reserva) {
        return reservaService.crearReserva(reserva);
    }

    @DeleteMapping("/reserva/{id}")
    public ResponseEntity<Void> eliminarReserva(@PathVariable String id) {
        reservaService.eliminarReserva(id);
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}