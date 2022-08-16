package com.heranca;

public class Animais {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Animal gato2 = new Gato();

        gato.miar();
        gato.Dormir();
        System.out.println(gato.getPeso());
    }
}

class Animal{
    private Double peso;
    public void Dormir(){
        System.out.println("Animal dormindo");
    }

    public Double getPeso(){
        return peso;
    }

}

class Gato extends Animal{
    public void miar(){
        System.out.println("Gato miando");
    }


}
