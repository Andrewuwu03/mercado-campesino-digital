package com.mercadocampesino.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class ReservaServiceTest {
    private final ReservaService service = new ReservaService();
    private final LocalDateTime ahora = LocalDateTime.of(2026, 10, 29, 10, 0);
    private final LocalDateTime cierre = LocalDateTime.of(2026, 10, 30, 18, 0);

    @Test void reservaValidaDescuentaInventario() {
        assertEquals(3, service.validarReserva(5, 2, ahora, cierre));
    }
    @Test void rechazaCantidadMayorAlInventario() {
        assertThrows(IllegalStateException.class,
            () -> service.validarReserva(1, 2, ahora, cierre));
    }
    @Test void rechazaReservaEnElCierre() {
        assertThrows(IllegalStateException.class,
            () -> service.validarReserva(5, 1, cierre, cierre));
    }
}
