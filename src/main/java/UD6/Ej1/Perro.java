package UD6.Ej1;

public class Perro extends Animal {

    @Override
    public String hacerSonido(){
        return super.hacerSonido()  + " Guau";
    }
}
