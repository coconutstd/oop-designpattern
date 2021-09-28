package decorator.simple;

public class Service implements IService{
    IService service;

    @Override
    public String runSomething() {
        return "서비스 짱!!";
    }
}
