package structural.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationComponent {
    private String name;
    private List<OrganizationComponent> children;

    public Department(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public List<OrganizationComponent> getChildren() {
        return children;
    }

    public void addChildren(OrganizationComponent child) {
        this.children.add(child);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHours() {
        int totalHours = 0;
        for (OrganizationComponent child : children) {
            totalHours += child.getHours();
        }

        return totalHours;
    }
}
