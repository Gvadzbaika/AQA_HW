package HW2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Кількість робочих годин на тиждень становить: ");
        double weekTime = scan.nextDouble();

        System.out.println("Річна зарплатня з податками становить: ");
        double yearSalary = scan.nextDouble();

        System.out.println("Вісоток податку становить: ");
        double tax = scan.nextDouble();

        double monthSalary = (yearSalary-yearSalary*tax/100)/12;
        double payHour = (monthSalary/4)/weekTime;

        System.out.println("При " +weekTime+ " робочих годин на тиждень з річною зарплатею в "
                +yearSalary+ " та податком " +tax+"% година часу коштує "+payHour+"$");
    }
}
