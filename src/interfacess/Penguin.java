package interfacess;

public class Penguin implements swimable, walkable {
    public void swim() {
        System.out.println("Penguin is swimming.");
    }

    public void walk() {
        System.out.println("Penguin is walking.");
    }
}

