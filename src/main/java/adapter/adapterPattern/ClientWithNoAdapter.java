package adapter.adapterPattern;

public class ClientWithNoAdapter {
    public static void main(String[] args) {
        ServiceA sa1 = new ServiceA();
        ServiceB sa2 = new ServiceB();

        sa1.runServiceA();
        sa2.runServiceB();
    }
}
