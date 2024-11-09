package Composite;

public abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public abstract void display(int depth);
    public abstract int getEmployeeCount();
    public abstract double getBudget();
}

