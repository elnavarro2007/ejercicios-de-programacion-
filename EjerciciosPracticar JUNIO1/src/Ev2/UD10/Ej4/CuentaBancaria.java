package Ev2.UD10.Ej4;

public class CuentaBancaria {
    private String numCuenta;
    private String titular;
    private double saldo;

    public double depositar(double monto){
        saldo = getSaldo()+monto;
        return saldo;
    }

    public double retirar(double monto){

        if (getSaldo() <= 0 || monto > getSaldo()){
            System.out.println("El saldo es negativo, no puede retirase nada, no puede retirarse una cantidad mayor");
        }else {
            saldo = getSaldo()-monto;
        }
        return saldo;

    }
    public double mostrarSaldo(){
        return saldo;
    }


    public CuentaBancaria() {
    }

    public CuentaBancaria(String numCuenta, String titular, double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
