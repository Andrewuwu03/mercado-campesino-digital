# Arquitectura propuesta

## Tres capas
1. **Presentación:** HTML5, CSS3 y JavaScript para una interfaz responsiva.
2. **Lógica de negocio:** Java con Spring Boot y API REST para autenticación, roles, ofertas, cierre semanal, reservas y reportes.
3. **Persistencia:** PostgreSQL o MySQL para usuarios, productores, veredas, productos, ofertas y reservas.

## Herramientas propuestas
- Git y GitHub para control de versiones.
- JUnit y pruebas de API para pruebas unitarias, integración, aceptación, rendimiento y concurrencia.

## Consideraciones
La validación de horario y disponibilidad debe ejecutarse en el servidor. La comprobación de inventario, creación de la reserva y descuento de cantidad deben realizarse dentro de una transacción. La interfaz debe ser liviana para celulares de gama baja. La selección definitiva de base de datos y alojamiento debe validarse con el equipo y los costos reales.

Diseño académico propuesto; no representa una solución desplegada.
