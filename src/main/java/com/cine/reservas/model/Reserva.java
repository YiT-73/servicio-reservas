package com.cine.reservas.model;

import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Document(collection = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 100, message = "El nombre del cliente debe tener entre 3 y 100 caracteres")
    private String cliente;

    @NotNull
    private LocalDate fecha;

    @NotNull
    private  String pelicula_nombre;

    @NotNull
    private Long peliculaId;

    @NotNull
    private Long usuarioId;

}