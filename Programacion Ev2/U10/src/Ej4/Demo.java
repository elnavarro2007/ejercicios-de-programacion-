package Ej4;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuenta = new ArrayList<>();
        CuentaBancaria c = new CuentaBancaria("20","tumadre",2000.0);
        c.depositar(200);
        c.retirar(300);

        System.out.println(c.CuentaCorriente());
    }
}
