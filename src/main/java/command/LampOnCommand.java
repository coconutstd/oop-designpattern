package command;

interface Command {
    public abstract void execute();
}

class Button2 {
    private Command theCommand;

    public Button2(Command theCommand) {
        setCommand(theCommand);
    }

    public void setCommand(Command newCommand) {
        this.theCommand = newCommand;
    }

    public void pressed() {
        theCommand.execute();
    }
}

class Lamp2 {
    public void turnOn() {
        System.out.println("Lamp On");
    }
}

public class LampOnCommand implements Command{
    private Lamp theLamp;

    public LampOnCommand(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    public void execute(){
        theLamp.turnOn();
    }
}

class Alarm {
    public void start() {
        System.out.println("Alarming...");
    }
}

class AlarmOnCommand implements Command {
    private Alarm theAlarm;

    public AlarmOnCommand(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    public void execute() {
        theAlarm.start();
    }
}

class Client2 {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Button2 button1 = new Button2(lampOnCommand);
        button1.pressed();

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        Button2 button2 = new Button2(alarmOnCommand);
        button2.pressed();

        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
