package Composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void add(OrganizationComponent component) {
        components.add(component);
    }

    public void remove(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "+ Department: " + name);
        for (OrganizationComponent component : components) {
            component.display(depth + 2);
        }
    }

    @Override
    public int getEmployeeCount() {
        int count = 0;
        for (OrganizationComponent component : components) {
            count += component.getEmployeeCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double totalBudget = 0;
        for (OrganizationComponent component : components) {
            totalBudget += component.getBudget();
        }
        return totalBudget;
    }
}
