# Modelo de datos propuesto

| Entidad | Atributos clave | Relaciones |
|---|---|---|
| Usuario | id_usuario (PK), nombre, correo, hash_contrasena, rol, estado | Un cliente puede tener muchas reservas; un usuario productor se vincula a un productor. |
| Productor | id_productor (PK), id_usuario (FK), nombre_comercial, contacto, id_vereda (FK) | Una vereda tiene muchos productores; un productor publica muchas ofertas. |
| Vereda | id_vereda (PK), nombre, municipio | Agrupa productores. |
| Producto | id_producto (PK), nombre, categoría, unidad_base, estado | Puede aparecer en muchas ofertas. |
| Oferta | id_oferta (PK), id_productor (FK), id_producto (FK), jornada, precio, cantidad_inicial, cantidad_disponible, estado | Un productor publica muchas ofertas; un producto aparece en muchas ofertas. |
| Reserva | id_reserva (PK), id_usuario (FK), fecha_hora, estado, codigo_confirmacion | Un cliente realiza muchas reservas. |
| DetalleReserva | id_detalle (PK), id_reserva (FK), id_oferta (FK), cantidad, precio_unitario | Una reserva contiene detalles de ofertas. |
| Jornada | id_jornada (PK), fecha_mercado, fecha_cierre, estado | Contiene ofertas y reservas relacionadas. |

PK = clave primaria. FK = clave foránea. Confirmar con la Secretaría si una reserva puede incluir productos de varios productores.
