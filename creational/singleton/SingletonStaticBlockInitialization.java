package creational.singleton;


public class SingletonStaticBlockInitialization {
    private static SingletonStaticBlockInitialization instance;
    private int state = 0;
    private SingletonStaticBlockInitialization() {}

    static {
        try {
            instance = new SingletonStaticBlockInitialization();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static SingletonStaticBlockInitialization getInstance() {
        return instance;
    }

    public void changeState() {
        state = state + 1;
    }

    public void showState() {
        System.out.println("state : " + state);
    }
}
