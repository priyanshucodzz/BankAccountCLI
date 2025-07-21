package SOLID.adpter;

class ChargerAdapter implements USBTypeC {
    private OldCharger oldCharger;

    // Constructor
    public ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargePhone() {
        // Internally use the old charger
        oldCharger.chargeWithRoundPin();
    }
}

