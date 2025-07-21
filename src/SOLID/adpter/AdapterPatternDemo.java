package SOLID.adpter;

public class AdapterPatternDemo {
    public static void main(String[] args) {

        OldCharger oldCharger = new OldCharger();
        USBTypeC adapter = new ChargerAdapter(oldCharger);
        adapter.chargePhone();
}
}
