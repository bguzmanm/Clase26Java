## Objetivo

Implementar un sistema de pagos que permita procesar diferentes tipos de pagos utilizando interfaces y el concepto de polimorfismo en Java.

### Descripción

Tienes que diseñar un sistema que pueda procesar diferentes métodos de pago. Los métodos de pago que se deben soportar son:

1. **Tarjeta de Crédito**
2. **PayPal**
3. **Transferencia Bancaria**

Cada método de pago debe implementar la interfaz `Pago`, que tiene el siguiente código:

```java
public interface Pago {
    void realizarPago(double cantidad);
}

```

### Requisitos

1. **Implementar la interfaz `Pago` para cada método de pago:**
    - **Tarjeta de Crédito:** Implementa la clase `PagoTarjetaCredito` que solicite el número de tarjeta, el nombre del titular y la fecha de caducidad.
    - **PayPal:** Implementa la clase `PagoPayPal` que solicite el correo electrónico y la contraseña.
    - **Transferencia Bancaria:** Implementa la clase `PagoTransferenciaBancaria` que solicite el número de cuenta y el banco.
2. **Clase Principal:**
    - Crea una clase `ProcesadorPagos` que tenga un método `procesar` que acepte como parámetro un objeto del tipo `Pago` y una cantidad a pagar. Este método debe llamar al método `realizarPago` del objeto recibido.

    ```java
    public class ProcesadorPagos {
        public void procesar(Pago metodoPago, double cantidad) {
            metodoPago.realizarPago(cantidad);
        }
    }
    
    ```

3. **Polimorfismo:**
    - En la clase `Main`, crea instancias de cada método de pago y utiliza el `ProcesadorPagos` para procesar pagos de diferentes tipos utilizando polimorfismo.

### Ejemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        Pago pagoTarjeta = new PagoTarjetaCredito("1234567890123456", "Juan Perez", "12/24");
        Pago pagoPayPal = new PagoPayPal("juan.perez@example.com", "password123");
        Pago pagoTransferencia = new PagoTransferenciaBancaria("12345678", "Banco Ejemplo");

        ProcesadorPagos procesador = new ProcesadorPagos();

        procesador.procesar(pagoTarjeta, 100.0);
        procesador.procesar(pagoPayPal, 200.0);
        procesador.procesar(pagoTransferencia, 300.0);
    }
}

```

### Notas Adicionales

- Asegúrate de que cada implementación de método de pago tenga su propio constructor que inicialice los campos requeridos.
- La salida de cada método `realizarPago` debe imprimir un mensaje indicando el método de pago utilizado y la cantidad pagada.

---