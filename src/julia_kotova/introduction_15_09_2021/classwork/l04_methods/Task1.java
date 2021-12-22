package julia_kotova.introduction_15_09_2021.classwork.l04_methods;

public class Task1 {

    public static void main(String[] args) {

        double employee1 = 10000;
        double employee2 = 12000;
        double employee3 = 14000;
        double tax = 5;

        double salaryTenYears1 = calculateSalaryTenYears(employee1);
        double salaryTenYears2 = calculateSalaryTenYears(employee2);
        double salaryTenYears3 = calculateSalaryTenYears(employee3);

        double salaryTax1 = calculateSalaryTax(salaryTenYears1);
        double salaryTax2 = calculateSalaryTax(salaryTenYears2);
        double salaryTax3 = calculateSalaryTax(salaryTenYears3);

        double average = calculateAverage(salaryTax1, salaryTax2, salaryTax3);

        Methods.printMessage("Average salary for 10 years: " + average);

    }

    public static double calculateSalaryTenYears(double employee) {
        return employee * 120;
    }

    public static double calculateSalaryTax(double salaryTenYears) {
        return salaryTenYears * 0.95;
    }

    public static double calculateAverage(double salaryTax1, double salaryTax2, double salaryTa3x) {
        return (salaryTax1 + salaryTax2 + salaryTa3x) / 3;
    }

}
