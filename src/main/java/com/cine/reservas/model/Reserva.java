package com.cine.reservas.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Document(collection = "tickets")
public class Reserva {

    @Id
    private String id; // MongoDB usa id tipo String por defecto

    private String usuario;

    private LocalDate fecha;

    private String pelicula_nombre;

    private Long peliculaId;

    private Long usuarioId;
}