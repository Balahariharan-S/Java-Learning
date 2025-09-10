public class PayrollDemo {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("John", 50000, 5000);
        Employee1 e2 = new Employee1("Mary", 60000, 7000);

        e1.printPaySlip();
        e2.printPaySlip();
    }
}
