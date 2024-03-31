package creational.builder;

public class Pizza {
    private String name;
    private String size;
    private String topping;

    public Pizza(String name, String size, String topping) {
        this.name = name;
        this.size = size;
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza [name=" + name + ", size=" + size + ", topping=" + topping + "]";
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
}
