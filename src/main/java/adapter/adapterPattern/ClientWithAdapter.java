package adapter.adapterPattern;

public class ClientWithAdapter {
    public static void main(String[] args) {
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asa2 = new AdapterServiceB();

        asa1.runService();
        asa2.runService();
    }
}
