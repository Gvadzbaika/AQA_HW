package HW4;

public class Task4 {
    public static void main(String[] args) {

        double hourlyPrice;
        hourlyPrice = Integer.parseInt(args[0]);
        double tax;
        tax = Integer.parseInt(args[1]);

        String[] months;
        months = new String[]{"JAN   ", "FEB   ", "MAR   ", "APR   ", "MAY   ", "JUN   ",
                              "JUL   ", "AUG   ", "SEP   ", "OKT   ", "NOV   ", "DEC   "};
        int[] days;
        days = new int[] {23,20,22,21,23,21,22,23,20,23,22,21};
        double sums =0;
        for (int i = 0; i < months.length; i++)
        {
            double monthSalary =days[i]*8*hourlyPrice;
            double monthSalaryWithTax = (days[i]*8*hourlyPrice)-(days[i]*8*tax*hourlyPrice/100);
            System.out.println(months[i] + " "+monthSalaryWithTax + " "+monthSalary);
            sums += days[i] * 8 * hourlyPrice;
        }
        System.out.println("TOTAL  "+sums+" "+(sums-sums*tax/100));

    }
}