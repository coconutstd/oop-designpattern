package command;

class Lamp {
    public void turnOn() {
        System.out.println("Lamp On");
    }
}

public class Button {
    private Lamp theLamp;

    public Button(Lamp theLamp) {
        this.theLamp = theLamp;
    }

    public void pressed() {
        theLamp.turnOn();
    }
}

class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button lampButton = new Button(lamp);
        lampButton.pressed();
    }
}
