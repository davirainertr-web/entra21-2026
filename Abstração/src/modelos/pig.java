package modelos;

public class pig extends animal {

    @Override
    public void animalSound() {
        System.out.println("som do porco");
    }

    @Override
    public void sleep() {
        System.out.println("Porco dormindo");
    }
}
