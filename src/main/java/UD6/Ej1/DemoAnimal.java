package UD6.Ej1;

public class DemoAnimal {
    static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        System.out.println(perro.hacerSonido());
        System.out.println(gato.hacerSonido());
    }
}
