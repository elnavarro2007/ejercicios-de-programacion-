package Ej4;

public class CuentaBancaria {
    private String numCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numCuenta, String titular, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar (double monto){
        System.out.println(monto+ " € depositados");
        saldo = saldo + monto;
    }
    public void retirar (double monto){
        System.out.println(monto + " € retirado");
        saldo =saldo-monto;
    }
    public double mostrarSaldo(){
        return saldo;
    }
    public void getTitular(){
        System.out.println(titular);
    }
    public void setTitular (){
        System.out.println(titular);
    }

    public String CuentaCorriente (){
        return "numCuenta "+numCuenta+" titular "+titular+" Queda de saldo "+saldo + " €";
    }
}
