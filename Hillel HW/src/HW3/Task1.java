package HW3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System. out .print("Enter number:\n");
        int num = s.nextInt();

        if (isPrime(num)) {
            System. out .print(num + " -is prime number, ");
        }
        else {
            System. out .print(num + " - is not prime number, ");
        }

        if (num<0) {
            System. out .print("is negative number, ");
        }
        else if (num==0) {
            System. out .print("is not negative or positive number, ");
        }
        else {
            System. out .print( "is positive number, ");
        }

        if (num%2==0) {
            System. out .println( "is even number.");
        }
        else {
            System. out .println( "is odd number.");
        }
    }
    public static boolean isPrime ( int num ) {
        if (num <= 1 ) {
            return false ;
        }
        for ( int i = 2 ; i<=Math.sqrt(num); i++) {
            if (num% i == 0 ) {
                return false ;
            }
        }
        return true ;
    }
 }