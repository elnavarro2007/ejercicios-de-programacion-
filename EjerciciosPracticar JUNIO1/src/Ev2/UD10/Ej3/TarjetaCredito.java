package Ev2.UD10.Ej3;

public class TarjetaCredito extends MetodoPago{



    @Override
    public String procesarPago(double monto) {
        return "El pago realizado con la tarjeta son : "+monto;
    }
}
