public class Vehiculo {
        public String marca;
        public String vehiculo;


    public Vehiculo(String marca, String vehiculo) {
        this.marca = marca;
        this.vehiculo = vehiculo;
    }

    public String arrancara() {
        return "Marca "+ marca + "Tipo Vehiculo "+ vehiculo;
    }
}
