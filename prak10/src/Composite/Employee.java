package Composite;

public class Employee extends OrganizationComponent {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "- Employee: " + name + " (Salary: " + salary + ")");
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return salary;
    }
}



