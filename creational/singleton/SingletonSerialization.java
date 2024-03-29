package creational.singleton;

import java.io.Serializable;

public class SingletonSerialization implements Serializable {
    private SingletonSerialization() {
    }

    private static class InnerClassHelper {
        public static SingletonSerialization instance = new SingletonSerialization();
    }

    public static SingletonSerialization getInstance() {
        return InnerClassHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
