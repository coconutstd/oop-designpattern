package factory;

import java.util.*;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private ThroughputScheduler scheduler;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; ++i) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
        scheduler = new ThroughputScheduler();
    }

    void requestElevator(int destination, Direction direction) {
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
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

class ThroughputScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;
    }
}

class Direction {
}