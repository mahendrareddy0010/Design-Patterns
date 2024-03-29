package creational.singleton;

public class SingletonPughInitialization {
    private SingletonPughInitialization() {
    }

    private static class InnerClassHelper {
        public static SingletonPughInitialization instance = new SingletonPughInitialization();
    }

    public static SingletonPughInitialization getInstance() {
        return InnerClassHelper.instance;
    }
}
