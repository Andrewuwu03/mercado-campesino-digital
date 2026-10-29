// Validación local de demostración; no crea una reserva real.
const button = document.querySelector("#reserve");
const quantity = document.querySelector("#quantity");
const product = document.querySelector("#product");
const message = document.querySelector("#message");

button.addEventListener("click", () => {
  const requested = Number(quantity.value);
  if (!Number.isInteger(requested) || requested <= 0) {
    message.textContent = "Ingresa una cantidad entera mayor que cero.";
    return;
  }
  message.textContent = `Demostración: seleccionaste ${requested} unidad(es) de ${product.value}. No se registró una reserva real.`;
});
