package cl.praxis.pagos;

import cl.praxis.interfaces.Pago;

public class ProcesadorPagos {
  public void procesar(Pago metodoPago, double cantidad) {
    metodoPago.realizarPago(cantidad);
  }
}
