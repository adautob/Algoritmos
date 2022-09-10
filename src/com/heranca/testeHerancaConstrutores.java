package com.heranca;

class AnimalTeste{
    public AnimalTeste(){
        System.out.println("Eu sou um animal genérico");
    }
}

class Mamifero extends AnimalTeste{
    public Mamifero(){
        System.out.println("Eu sou um animal mamífero");
    }
}

class Cachorro extends Mamifero{
    public Cachorro(){
        System.out.println("Eu sou um cachorro fofinho");
    }
}



public class testeHerancaConstrutores {
    public static void main(String[] args) {

        Cachorro caoDoido = new Cachorro();

    }
}
