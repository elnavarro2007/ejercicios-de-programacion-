package Ev2.UD10.Ej3;

public class TransferenciaBancaria extends MetodoPago{

    @Override
    public String procesarPago(double monto) {
        return "Transferencia Realizada : "+monto;
    }
}
