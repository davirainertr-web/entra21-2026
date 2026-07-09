import modelos.Mamifero;
import modelos.pig;

public class Main {
    public static void main(String[] args) {
        //Animal a1 =  new Animal();
        pig p1 = new pig();
        p1.animalSound();
        p1.sleep();
        System.out.println("olá");

        Mamifero m1 = new Mamifero();
        m1.animalSound();
        m1.sleep();

    }
}