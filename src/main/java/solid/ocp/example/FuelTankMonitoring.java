package solid.ocp.example;

public class FuelTankMonitoring {

    public void checkAndWarn() {

        if (checkFuelTank()) {
            giveWarningSignal();
        }
    }

    private boolean checkFuelTank() {}
    private void giveWarningSignal() {}
}
