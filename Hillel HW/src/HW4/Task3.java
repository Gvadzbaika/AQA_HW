package HW4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String reply;
        reply = "yes";

        while(reply.equals("yes")) {
            System. out .print("Please enter the total loan amount:\n");
            int sum = s.nextInt();
            System. out .print("Please enter the percent:\n");
            double percent = s.nextInt();
            System. out .print("Please select type of calculation:\n"+
                    "1.Calculate the number of monthly payments to fully repay the loan \n"+
                    "2.Calculate the amount of the monthly payment\n");
            int typeCalculation = s.nextInt();

            if (typeCalculation == 1) {
                System.out.print("Please enter the amount of the monthly payment:\n");
                int sumPayment = s.nextInt();
                percent/=100;// процент переводим в друбную часть
                int i=0;
                double minPay = sum*percent+1;
                double x=sum-sumPayment;//Сумма кредита с вычетом первого месяца
                double pm = x*(percent);//Процент за первый месяц
                if(pm>sumPayment) {
                    System.out.println("The amount of the monthly payment cannot be less than the percentage");
                    System.out.println("The minimum amount of the monthly payment is: "+minPay);
                }else {
                    for(;i<x;i++) {
                        double monthlyPayments =x+pm;
                        x=monthlyPayments-sumPayment;
                    }System.out.println("The number of monthly payments ="+i);
                }
            }
            else if (typeCalculation == 2) {
                System.out.print("Please enter number of payments:\n");
                double numPayment = s.nextInt();
                double sumInMonth=0;
                int i=0;
                percent/=100;// процент переводим в друбную часть
                for(;i<numPayment;i++){
                    double payInMonth = sum/numPayment + sum/numPayment*i*percent;
                    sumInMonth+=payInMonth;
                }
                System.out.println("The amount of the monthly payment:"+ sumInMonth/numPayment);
            }
            else {
                System.out.print("You entered wrong number!\n");
            }
            System.out.println("Do you want to repeat? [yes/no]");
            reply = "";

            while (!reply.equals("yes") && !reply.equals("no")) {
                reply = s.nextLine();
            }
        }
        s.close();
        System.out.println("Goodbye");

    }
}

        //Розрахунок щомісчного платежу -
        double monthlyPayment = (sumCredit * monthlyPercent/100/12) /
        (1 - Math.pow(1 + monthlyPercent/100/12, -numPayments));
        //Кілкість щомісячних платежів
        int numPayments = (int) Math.ceil(-(Math.log(1 - monthlyPercent/100/12 * sumCredit / monthlyPayment) /
        Math.log(1 + monthlyPercent/100/12)));
