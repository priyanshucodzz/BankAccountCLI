package SOLID.factory;

public class OSFactory {
    public MobileOS getInstance(String type){
        if (type == null) {return null;}
        if (type.equalsIgnoreCase("Android")) {return new Android();}
        else if (type.equalsIgnoreCase("Microsoft")) {return new Microsoft();}
        else if (type.equalsIgnoreCase("iOS")) return new IOS();
        else return null;

}

}
