package HW2;

public class Task2 {
    public static void main(String[] args) {
        int weekTime;
        weekTime = Integer.parseInt(args[0]);
        int payHour;
        payHour = Integer.parseInt(args[1]);
        int tax;
        tax = Integer.parseInt(args[2]);

        double monthSalary = weekTime*payHour*4;
        double monthSalaryPDF = monthSalary - monthSalary * tax/100;
        double yearSalary = monthSalary *12;
        double yearSalaryPDF = yearSalary - yearSalary * tax/100;

        System.out.println("Зарплатня на місяць без податків: "+monthSalary);
        System.out.println("Зарплатня на місяць з податками: "+monthSalaryPDF);
        System.out.println("Зарплатня на рік без податків: "+yearSalary);
        System.out.println("Зарплатня на рік з податками: "+yearSalaryPDF);
    }
}
