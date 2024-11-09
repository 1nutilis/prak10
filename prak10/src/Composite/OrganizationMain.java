package Composite;

public class OrganizationMain {
    public static void main(String[] args) {
        Department headOffice = new Department("Head Office");
        Department itDepartment = new Department("IT Department");
        Department hrDepartment = new Department("HR Department");

        itDepartment.add(new Employee("Alice", 70000));
        itDepartment.add(new Employee("Bob", 60000));
        hrDepartment.add(new Employee("Charlie", 50000));

        headOffice.add(itDepartment);
        headOffice.add(hrDepartment);

        headOffice.display(1);
        System.out.println("Total Employees: " + headOffice.getEmployeeCount());
        System.out.println("Total Budget: $" + headOffice.getBudget());
    }
}

