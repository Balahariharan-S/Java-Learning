public class Employee1{
    private String name;
    private double salary;
    private double bonus;

    public Employee1(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public double calculatePay() {
        return salary + bonus;
    }

    public void printPaySlip() {
        System.out.println("Employee: " + name + " | Total Pay: " + calculatePay());
    }
}
