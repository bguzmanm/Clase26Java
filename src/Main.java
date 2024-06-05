import cl.praxis.interfaces.Pago;
import cl.praxis.pagos.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Pago> procesoMasivo = new ArrayList<>();

    procesoMasivo.add(new PagoTarjetaCredito(123456, "Juan Perez", "12/24"));
    procesoMasivo.add(new PagoPayPal("juan.perez@example.com", "password123"));
    procesoMasivo.add(new PagoTransferenciaBancaria(12345678, "Banco Ejemplo"));
    procesoMasivo.add(new PagoBitcoin("ASDF·$E", "email@trucho.com"));

    ProcesadorPagos procesador = new ProcesadorPagos();

    for (Pago pago : procesoMasivo) {
      procesador.procesar(pago, 100);
    }

    /*
    procesador.procesar(pagoTarjeta, 100.0);
    procesador.procesar(pagoPayPal, 200.0);
    procesador.procesar(pagoTransferencia, 300.0);
    procesador.procesar(pagoBicoin, 400);
    */

  }
}