package HW2;

public class Task1 {
    public static void main(String[] args) {
        int a;
        a = Integer.parseInt(args[0]);
        int b;
        b = Integer.parseInt(args[1]);
        double res = Math.pow(a,b);

        System.out.printf("Число a в степени b равно: %.0f \n",res);
    }
}

