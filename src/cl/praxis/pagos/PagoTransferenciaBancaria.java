package cl.praxis.pagos;

import cl.praxis.interfaces.Pago;

public class PagoTransferenciaBancaria implements Pago {
  private double cuenta;
  private String banco;

  public PagoTransferenciaBancaria() {
  }

  public PagoTransferenciaBancaria(double cuenta, String banco) {
    this.cuenta = cuenta;
    this.banco = banco;
  }

  public double getCuenta() {
    return cuenta;
  }

  public void setCuenta(double cuenta) {
    this.cuenta = cuenta;
  }

  public String getBanco() {
    return banco;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  @Override
  public void realizarPago(double cantidad) {
    System.out.printf("Se realiza pago Transferencia Bancaria por $%f\n", cantidad);
  }
}
