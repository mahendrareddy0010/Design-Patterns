package creational.singleton;

public class SingletonLazyIntialization {
    private static SingletonLazyIntialization instance;
    private int state = 0;
    private SingletonLazyIntialization() {
    }

    public static SingletonLazyIntialization getInstance() {
        if (instance == null) {
            instance = new SingletonLazyIntialization();
        }

        return instance;
    }

    public void changeState() {
        state = state + 1;
    }

    public void showState() {
        System.out.println("state : " + state);
    }
}
