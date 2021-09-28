package decorator.simple;

public class ClientWithDecorater {
    public static void main(String[] args) {
        IService decorater = new Decorater();
        System.out.println(decorater.runSomething());
    }
}
