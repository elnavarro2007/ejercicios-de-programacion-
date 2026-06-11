package Ev2.UD10.Ej3;

public class demo {
    public static void main(String[] args) {
        PayPal p1 = new PayPal();
        TarjetaCredito t1  = new TarjetaCredito();
        TransferenciaBancaria t2 = new TransferenciaBancaria();

        System.out.println(p1.procesarPago(1200));
        System.out.println(t1.procesarPago(12000));
        System.out.println(t2.procesarPago(1201));
    }
}
