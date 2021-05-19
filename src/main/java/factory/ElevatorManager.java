package factory;

import java.util.*;

public class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; ++i) {
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
    }

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler;

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if (hour < 12)
            scheduler = new ResponseTimeScheduler();
        else
            scheduler = new ThroughputScheduler();

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}

interface ElevatorScheduler {
    public abstract int selectElevator(ElevatorManager manager, int destination, Direction direction);
}

class ElevatorController {
    private int id;
    private int curFloor;

    public ElevatorController(int id) {
        this.id = id;
        curFloor = 1;
    }

    public void gotoFloor(int destination) {
        System.out.println("Elevator [" + id + "] Floor: " + curFloor);

        curFloor = destination;
        System.out.println(" ==> " + curFloor);
    }
}

class ResponseTimeScheduler implements ElevatorScheduler {
    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;
    }
}

class ThroughputScheduler implements ElevatorScheduler{
    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;
    }
}

class Direction {
}