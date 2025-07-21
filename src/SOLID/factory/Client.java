package SOLID.factory;

public class Client {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        MobileOS OS_1 = osFactory.getInstance("Android");
        MobileOS OS_2 = osFactory.getInstance("Microsoft");
        MobileOS OS_3 = osFactory.getInstance("iOS");

        OS_1.display();
        OS_2.display();
        OS_3.display();
    }

    }
