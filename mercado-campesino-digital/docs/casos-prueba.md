# Casos de prueba propuestos

| Código | Requisito | Condición | Resultado esperado |
|---|---|---|---|
| CP-01 | RF-03 | Publicar con datos válidos y cantidad 10 | Oferta activa en catálogo. |
| CP-02 | RF-03 | Cantidad igual a cero | Rechazo y mensaje de validación. |
| CP-03 | RF-05 | Buscar producto existente | Datos y disponibilidad correctos. |
| CP-04 | RF-06 | Reservar 2 con 5 disponibles antes del cierre | Reserva confirmada; quedan 3. |
| CP-05 | RF-07 | Reservar 3 cuando hay 2 disponibles | Rechazo; inventario sigue en 2. |
| CP-06 | RF-06 | Reservar exactamente a la hora de cierre | Rechazo. |
| CP-07 | RNF-01 | 100 usuarios y 10.000 ofertas | 95 % de consultas en menos de 3 segundos. |
| CP-08 | RNF-02 | Usuario sin sesión intenta publicar o ver reportes | Acceso denegado. |
| CP-09 | RF-07 | Dos clientes intentan reservar la última unidad | Solo una reserva confirmada. |
| CP-10 | RNF-03 | Cinco productores publican oferta | Al menos cuatro terminan en máximo 5 minutos sin ayuda. |

Son pruebas planificadas, no evidencia de ejecución. Registrar fecha, entorno, resultado real, capturas y defectos al ejecutarlas.
