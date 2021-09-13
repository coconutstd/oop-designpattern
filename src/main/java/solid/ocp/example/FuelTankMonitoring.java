package solid.ocp.example;

public class FuelTankMonitoring {

    public void checkAndWarn() {

        if (checkFuelTank()) {
            giveWarningSignal();
        }
    }

    private boolean checkFuelTank() {return false;}
    private void giveWarningSignal() {}
}
