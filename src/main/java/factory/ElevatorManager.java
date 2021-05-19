package factory;

import java.util.*;

enum SchedulingStategyID { RESPONSE_TIME, THROUGHTPUT, DYNAMIC }
enum Direction { UP, DOWN }

class SchedulerFactory {
    public static ElevatorScheduler getScheduler(SchedulingStategyID stategyID) {
        ElevatorScheduler scheduler = null;
        switch (stategyID) {
            case RESPONSE_TIME:
                scheduler = new ResponseTimeScheduler();
                break;
            case THROUGHTPUT:
                scheduler = new ThroughputScheduler();
                break;
            case DYNAMIC:
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                if (hour < 12)
                    scheduler = new ResponseTimeScheduler();
                else
                    scheduler = new ThroughputScheduler();
                break;
        }
        return scheduler;
    }
}

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStategyID stategyID;

    public ElevatorManager(int controllerCount, SchedulingStategyID stategyID) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; ++i) {
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
        this.stategyID = stategyID;
    }

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(stategyID);
        System.out.println(scheduler);
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




class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(2, SchedulingStategyID.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughputScheduler = new ElevatorManager(2, SchedulingStategyID.THROUGHTPUT);
        emWithThroughputScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStategyID.DYNAMIC);
        emWithDynamicScheduler.requestElevator(10, Direction.UP);

    }
}