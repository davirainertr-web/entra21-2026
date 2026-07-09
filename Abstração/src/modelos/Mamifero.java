package modelos;

import interfaces.IAnimal;

public class Mamifero implements IAnimal {
    @Override
    public void animalSound() {
        System.out.println("som de mamifero");
    }

    @Override
    public void sleep() {
        System.out.println("mamifero dormindo");
    }
    
}
