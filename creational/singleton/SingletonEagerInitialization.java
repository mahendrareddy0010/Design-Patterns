package creational.singleton;

public class SingletonEagerInitialization {
    private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();
    private int state = 0;
    private SingletonEagerInitialization() {}

    public static SingletonEagerInitialization getInstance() {
        return instance;
    }

    public void changeState() {
        state = state + 1;
    }

    public void showState() {
        System.out.println("state : " + state);
    }
}
