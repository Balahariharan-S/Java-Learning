public class SalarySlip {
    public static void main(String[] args) {
        // Employee details
        String employeeName = "John";
        double baseSalary = 3000.0;
        double bonus = 500.0;
        double deductions = 300.0;

        // Calculate net salary
        double netSalary = baseSalary + bonus - deductions;

        // Print salary slip
        System.out.println("Employee: " + employeeName);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Deductions: $" + deductions);
        System.out.println("Net Salary: $" + netSalary);
    }
}