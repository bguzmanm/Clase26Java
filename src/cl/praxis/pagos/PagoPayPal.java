package cl.praxis.pagos;

import cl.praxis.interfaces.Pago;

public class PagoPayPal implements Pago {
  private String correo;
  private String contrasena;

  public PagoPayPal() {
  }

  public PagoPayPal(String correo, String contrasena) {
    this.correo = correo;
    this.contrasena = contrasena;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  @Override
  public void realizarPago(double cantidad) {
    System.out.printf("Se realiza pago Paypal por $%f\n", cantidad);
  }
}
