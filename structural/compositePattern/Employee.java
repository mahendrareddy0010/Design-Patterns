package structural.compositePattern;

public class Employee implements OrganizationComponent{
    private String name;
    private int hours;
    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    
}
