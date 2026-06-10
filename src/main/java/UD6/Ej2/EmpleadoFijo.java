package UD6.Ej2;

public class EmpleadoFijo extends Empleado {
    public double horas;
    public int tarifa;

    @Override
    public double calcularSalario() {
        return super.salario = tarifa * horas;
    }

    public EmpleadoFijo(String nombre, double horas, int tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }
}
