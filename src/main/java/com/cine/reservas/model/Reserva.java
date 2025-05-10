package com.cine.reservas.model;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Document(collection = "reservas")
public class Reserva {

    @Id
    private String id; // MongoDB usa id tipo String por defecto

    @NotNull
    @Size(min = 3, max = 100, message = "El nombre del cliente debe tener entre 3 y 100 caracteres")
    private String usuario;

    @NotNull
    private LocalDate fecha;

    @NotNull
    private String pelicula_nombre;

    @NotNull
    private Long peliculaId;

    @NotNull
    private Long usuarioId;
}