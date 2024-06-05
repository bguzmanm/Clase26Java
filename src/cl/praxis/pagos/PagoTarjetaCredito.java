package cl.praxis.pagos;

import cl.praxis.interfaces.Pago;

public class PagoTarjetaCredito implements Pago {
  private double numeroTarjeta;
  private String nombreTitular;
  private String fechaCaducidad;

  public PagoTarjetaCredito() {
  }

  public PagoTarjetaCredito(double numeroTarjeta, String nombreTitular, String fechaCaducidad) {
    this.numeroTarjeta = numeroTarjeta;
    this.nombreTitular = nombreTitular;
    this.fechaCaducidad = fechaCaducidad;
  }

  public double getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public void setNumeroTarjeta(double numeroTarjeta) {
    this.numeroTarjeta = numeroTarjeta;
  }

  public String getNombreTitular() {
    return nombreTitular;
  }

  public void setNombreTitular(String nombreTitular) {
    this.nombreTitular = nombreTitular;
  }

  public String getFechaCaducidad() {
    return fechaCaducidad;
  }

  public void setFechaCaducidad(String fechaCaducidad) {
    this.fechaCaducidad = fechaCaducidad;
  }

  @Override
  public void realizarPago(double cantidad) {
    System.out.printf("Se realiza pago Tarjeta de Crédito por $%f\n", cantidad);
  }
}
