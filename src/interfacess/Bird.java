package interfacess;

public class Bird {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
        duck.walk();

        System.out.println();

        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.walk();

        System.out.println();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.walk();
    }
}
