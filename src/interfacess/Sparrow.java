package interfacess;

public class Sparrow implements Flyable, walkable {
    public void fly() {
        System.out.println("Sparrow is flying.");
    }

    public void walk() {
        System.out.println("Sparrow is walking.");
    }
}
