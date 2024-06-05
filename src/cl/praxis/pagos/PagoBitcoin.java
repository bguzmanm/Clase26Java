package cl.praxis.pagos;

import cl.praxis.interfaces.Pago;

public class PagoBitcoin implements Pago {
  private String monedero;
  private String email;

  public PagoBitcoin() {
  }

  public PagoBitcoin(String monedero, String email) {
    this.monedero = monedero;
    this.email = email;
  }

  public String getMonedero() {
    return monedero;
  }

  public void setMonedero(String monedero) {
    this.monedero = monedero;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public void realizarPago(double cantidad) {
    System.out.printf("Pago realizado con monedero Bitcoin por $%f", cantidad);
  }
}
