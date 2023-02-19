package HW3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double price;
        price = Integer.parseInt(args[0]);

        Scanner s = new Scanner(System.in);
        System. out .print("Enter quantity:\n");
        int n = s.nextInt();

        if (n<=0) {
            System. out .println( "You entered the wrong number");
        }
        else if (n<=10) {
            double sum10=price*n;
             System. out .println( "You don't have a discount \n" +
                     "Price for "+n +" items: " + sum10);
        }
        else if (n<=20) {
            double sum20= (price-price/100*5)*n;
            System. out .println( "You have discount - 5%\n" +
                    "Price for "+n +" items: " + sum20);
        }
        else if (n<=30){
            double sum30= (price-price/100*10)*n;

            System. out .println( "You have discount - 10%\n" +
                    "Price for "+n +" items: " + sum30);
        }
        else if (n<=80){
            double q=0.4;
            int x =(int) Math.floor(n - 31) / 10;
            if (x<=4) {
                double sum40 = ((n * price) - price * n * (0.12 + x * (q / 100)));
                double r = (x * q);
            System. out .println( "You have a discount: " + (12 + r) +
                    "%\nPrice for "+n +" items: " + sum40);
        }}
        else {
            double sum80= (price-price/100*14)*n;
            System. out .println( "You have discount - 14% \n" +
                    "Price for "+n +" items: " + sum80 );
        }
    }
}


