package Ev2.UD10.Ej3;

public class PayPal extends MetodoPago{


    @Override
    public String procesarPago(double monto) {
        return "Pago realizado con paypal : "+monto;
    }
}
