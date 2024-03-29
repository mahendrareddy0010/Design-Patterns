package creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
            throws InterruptedException, FileNotFoundException, ClassNotFoundException, IOException {
        Main main = new Main();

        // *********** Lazy initialization **********
        main.testEagerInitialization();

        // *********** Eager Initialization ************
        main.testStaticBlockInitialization();

        // *********** Static Block initialization **********
        main.testLazyInitialization();

        // ************ Thread Safe ***********
        main.testWithMultipleThreadS();

        // ************ Bill Pugh Singleton implementation **********
        main.testSingletonPughImplementation();
        main.testSingletonPughImplWithReflections();

        // ************** Serializable ****************
        main.testSingletonSerializable();
    }

    public void testEagerInitialization() {
        SingletonEagerInitialization singletonSimple1 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization singletonSimple2 = SingletonEagerInitialization.getInstance();

        if (singletonSimple1 == singletonSimple2) {
            System.out.println("Eager Initialization : Passed");
        } else {
            System.out.println("Eager Initialization : Failed");
        }

        // singletonSimple1.showState();
        // singletonSimple2.showState();
        // singletonSimple1.changeState();
        // singletonSimple1.showState();
        // singletonSimple2.showState();
    }

    public void testStaticBlockInitialization() {
        SingletonStaticBlockInitialization singletonSimple1 = SingletonStaticBlockInitialization.getInstance();
        SingletonStaticBlockInitialization singletonSimple2 = SingletonStaticBlockInitialization.getInstance();

        if (singletonSimple1 == singletonSimple2) {
            System.out.println("Static Block Intialization : Passed");
        } else {
            System.out.println("Static Block Intialization : Failed");
        }
    }

    public void testLazyInitialization() {
        SingletonLazyIntialization singletonSimple1 = SingletonLazyIntialization.getInstance();
        SingletonLazyIntialization singletonSimple2 = SingletonLazyIntialization.getInstance();

        if (singletonSimple1 == singletonSimple2) {
            System.out.println("Lazy Initialization : Passed");
        } else {
            System.out.println("Lazy Initialization : Failed");
        }
    }

    private static class ConcurrentArrayList<T> {
        private List<T> concurrentList;

        public ConcurrentArrayList() {
            concurrentList = new ArrayList<>();
        }

        public synchronized void add(T e) {
            concurrentList.add(e);
        }

        // in our present case, we don't need synchronized
        public T get(int idx) {
            return concurrentList.get(idx);
        }
    }

    public void testWithMultipleThreadS() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        ConcurrentArrayList<SingletonThreadSafe> instances = new ConcurrentArrayList<>();
        int NUM_THREADS = 1000;
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.add(Thread.ofVirtual().unstarted(() -> {
                instances.add(SingletonThreadSafe.getInstance());
            }));
        }
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.get(i).start();
        }
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.get(i).join();
        }
        SingletonThreadSafe instance = instances.get(0);
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            if (instance != instances.get(i)) {
                System.out.println("Thread Safe (Synchronized) : failed");
                return;
            }
        }
        System.out.println("Thread Safe (Synchronized) : passed");
    }

    public void testSingletonPughImplementation() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        ConcurrentArrayList<SingletonPughInitialization> instances = new ConcurrentArrayList<>();
        int NUM_THREADS = 1000;
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.add(Thread.ofVirtual().unstarted(() -> {
                instances.add(SingletonPughInitialization.getInstance());
            }));
        }
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.get(i).start();
        }
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.get(i).join();
        }
        SingletonPughInitialization instance = instances.get(0);
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            if (instance != instances.get(i)) {
                System.out.println("Thread Safe (Pugh implementation) : failed");
                return;
            }
        }
        System.out.println(String.format("**********    Thread Safe (Pugh implementation) : passed  ************"));
    }

    public void testSingletonPughImplWithReflections() throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        ConcurrentArrayList<SingletonPughInitialization> instances = new ConcurrentArrayList<>();
        int NUM_THREADS = 1000;
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.add(Thread.ofVirtual().unstarted(() -> {
                Constructor<?>[] cstrs = SingletonPughInitialization.class.getDeclaredConstructors();
                for (Constructor<?> constructor : cstrs) {
                    constructor.setAccessible(true);
                    try {
                        instances.add((SingletonPughInitialization) constructor.newInstance());
                    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                            | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                instances.add(SingletonPughInitialization.getInstance());
            }));
        }
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.get(i).start();
        }
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            threads.get(i).join();
        }
        SingletonPughInitialization instance = instances.get(0);
        for (int i = 0; i < NUM_THREADS; i = i + 1) {
            if (instance.hashCode() != instances.get(i).hashCode()) {
                System.out.println("*** Thread Safe (Pugh implementation) (Hash Code)  : failed");
                return;
            }
        }
        System.out.println(String.format("**** Thread Safe (Pugh implementation) (Hash Code)  : passed"));
    }

    public void testSingletonSerializable() throws FileNotFoundException, IOException, ClassNotFoundException {
        SingletonSerialization instance1 = SingletonSerialization.getInstance();
        SingletonSerialization instance2;

        // serializable
        FileOutputStream fos = new FileOutputStream("singleton.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(instance1);
        oos.close();
        fos.close();

        // de-serializable
        FileInputStream fis = new FileInputStream("singleton.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        instance2 = (SingletonSerialization) ois.readObject();
        fis.close();
        ois.close();

        if (instance1 != instance2) {
            System.out.println("Serializable : Failed");
            return;
        }

        System.out.println("Serializable : Passed");
    }

}
