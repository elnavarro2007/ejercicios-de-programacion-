package Ev2.UD10.Ej4;

public class Demo {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("123445","Fuuka",12200);
        CuentaBancaria c2 = new CuentaBancaria("1234456","Fuukatastic",1200);

        System.out.println("Salario actual de : "+c1.getTitular()+ " : "+c1.getSaldo());
        System.out.println("Salario actual de : "+c2.getTitular()+ " : "+c2.getSaldo());

        System.out.println(c1.depositar(201));
        System.out.println(c1.retirar(2000));
        System.out.println(c1.mostrarSaldo());
        System.out.println(c2.mostrarSaldo());


    }
}
