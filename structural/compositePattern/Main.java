package structural.compositePattern;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("emp1", 6);
        Employee emp2 = new Employee("emp2", 7);
        Employee emp3 = new Employee("emp3", 20);
        Department mathDepartment = new Department("Math");

        mathDepartment.addChildren(emp1);
        mathDepartment.addChildren(emp3);

        System.out.println("Employee Name : " + emp2.getName() + ", Works : " + emp2.getHours());
        System.out.println("Department Name : " + mathDepartment.getName() + ", Works : " + mathDepartment.getHours());
    }
}
