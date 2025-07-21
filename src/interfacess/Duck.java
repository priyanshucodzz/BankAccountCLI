package interfacess;


    public class Duck implements Flyable, swimable, walkable {
        public void fly() {
            System.out.println("Duck is flying.");
        }
        public void swim() {
            System.out.println("Duck is swimming.");
        }

        public void walk() {
            System.out.println("Duck is walking.");
        }
}
