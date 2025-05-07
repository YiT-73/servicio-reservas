package com.tuempresa.reservas.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente;
    private LocalDate fecha;

    // Getters y setters
}