public class DeveloperClient {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        int salary = employee1.getSalary();
        System.out.println("Salary: " + salary);

        Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.err.println("Salary: " + employee2.getSalary());
    }
}
