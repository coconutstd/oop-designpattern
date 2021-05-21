package solid.ocp;

public class TimeReminder {
    TimeProvider tProv;
    private MP3 m;

    public void setTimeProvider(TimeProvider tProv) {
        this.tProv = tProv;
    }

    public void reminder() {
        m = new MP3();
        int hours = tProv.getTime();
        if (hours >= 22) {
            m.playSong();
        }
    }
}

class MP3 {
    public void playSong() {
        System.out.println("Singing...");
    }
}


class Client {
    public static void main(String[] args) {
        TimeReminder sut = new TimeReminder();
        FakeTimeProvider tProvStub = new FakeTimeProvider();
        tProvStub.setHours(23);
        sut.setTimeProvider(tProvStub);
        sut.reminder();
    }
}