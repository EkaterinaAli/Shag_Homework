package homework23;

public class Report extends Employee {
    public Report() {
    }

    public Report(String fullName, double salary) {
        super(fullName, salary);
    }

    public  void generateReport() {
        System.out.printf("Работник %-15s получает зарплату %10.2f\n", getFullName(), getSalary());
    }
}
