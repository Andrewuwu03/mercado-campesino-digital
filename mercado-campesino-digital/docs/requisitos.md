# Requisitos resumidos

## Funcionales
- **RF-01:** registrar productores con nombre, contacto y vereda.
- **RF-02:** autenticar usuarios y controlar acceso por rol.
- **RF-03:** publicar oferta semanal con producto, cantidad, precio y unidad.
- **RF-04:** modificar o desactivar oferta antes del cierre.
- **RF-05:** consultar ofertas, precio, productor, unidad y disponibilidad.
- **RF-06:** reservar cantidades disponibles hasta el viernes a las 6:00 p. m.
- **RF-07:** impedir reservas superiores al inventario.
- **RF-08:** confirmar reservas y consultar estado y resumen.
- **RF-09:** generar reportes por producto, productor y vereda.
- **RF-10:** gestionar categorías y desactivar cuentas.

## No funcionales
- **RNF-01:** con 100 usuarios concurrentes y 10.000 ofertas, el 95 % de consultas responde en menos de 3 segundos.
- **RNF-02:** exigir autenticación y almacenar contraseñas mediante hash seguro.
- **RNF-03:** al menos 4 de 5 productores publican una oferta en máximo 5 minutos sin ayuda.
- **RNF-04:** tareas principales disponibles en las dos versiones recientes de Chrome para Android.
- **RNF-05:** conservar borradores localmente cuando sea posible e informar si no se sincronizan.
- **RNF-06:** informar la finalidad del tratamiento de datos y aplicar la Ley 1581 de 2012.
