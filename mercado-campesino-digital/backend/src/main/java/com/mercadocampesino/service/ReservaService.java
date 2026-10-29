package com.mercadocampesino.service;

import java.time.LocalDateTime;

/** Ejemplo académico; no sustituye una transacción real de base de datos. */
public class ReservaService {
    public int validarReserva(int disponible, int cantidadSolicitada,
                              LocalDateTime ahora, LocalDateTime fechaCierre) {
        if (ahora == null || fechaCierre == null) {
            throw new IllegalArgumentException("Las fechas son obligatorias");
        }
        if (cantidadSolicitada <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser positiva");
        }
        if (!ahora.isBefore(fechaCierre)) {
            throw new IllegalStateException("La jornada de reservas está cerrada");
        }
        if (disponible < cantidadSolicitada) {
            throw new IllegalStateException("Cantidad disponible insuficiente");
        }
        return disponible - cantidadSolicitada;
    }
}
