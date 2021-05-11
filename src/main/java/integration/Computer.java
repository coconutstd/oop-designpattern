package integration;

public class Computer {
    private MainBoard mb;
    private CPU c;
    private Memory m;
    private PowerSupply ps;

    // 합성관계
    public Computer() {
        this.mb = new MainBoard();
        this.c = new CPU();
        this.m = new Memory();
        this.ps = new PowerSupply();
    }

    // 집약관계
    public Computer(MainBoard mb, CPU c, Memory m, PowerSupply ps) {
        this.mb = mb;
        this.c = c;
        this.m = m;
        this.ps = ps;
    }
}

class MainBoard{}
class CPU{}
class Memory{}
class PowerSupply{}
