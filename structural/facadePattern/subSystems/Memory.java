package structural.facadePattern.subSystems;

public class Memory {
    public void load(int location, String data) {
        System.out.println("Location : " + location);
        System.out.println("Loading : "+ data);
    }
}
