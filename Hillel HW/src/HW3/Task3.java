package HW3;

public class Task3 {
    public static void main(String[] args) {
        double month;
        month = Integer.parseInt(args[0]);
        double hourlyPrice;
        hourlyPrice = Integer.parseInt(args[1]);
        double tax;
        tax = Integer.parseInt(args[2]);


        switch ((int) month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                double workingDay= 31-8;
                double workingHourInMonth=workingDay*8;
                double salary = workingHourInMonth*hourlyPrice;
                double salaryPDF = salary-salary/100*tax;
                System.out.println("Full salary: "+salary+"\nSalary with tax: " + salaryPDF);
                break;
            case 2:  workingDay= 28-8;
                workingHourInMonth=workingDay*8;
                salary = workingHourInMonth*hourlyPrice;
                salaryPDF = salary-salary/100*tax;
                System.out.println("Full salary: "+salary+"\nSalary with tax: " + salaryPDF);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                workingDay= 30-8;
                workingHourInMonth=workingDay*8;
                salary = workingHourInMonth*hourlyPrice;
                salaryPDF = salary-salary/100*tax;
                System.out.println("Full salary: "+salary+"\nSalary with tax: " + salaryPDF);;
                break;

            default:
                System.out.println("Wrong month");
        }
    }}
