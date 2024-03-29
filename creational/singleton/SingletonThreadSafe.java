package creational.singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance;
    private int state = 0;

    public SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }

    public synchronized void changeState() {
        state = state + 1;
    }

    public synchronized void showState() {
        System.out.println("state : " + state);
    }
}
