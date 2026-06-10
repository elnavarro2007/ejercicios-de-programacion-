package UD6.Ej1;

public class Gato extends Animal {

    @Override
    public String hacerSonido(){
        return super.hacerSonido()  + " Miau";
    }
}
