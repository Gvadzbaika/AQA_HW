public class Main {
    public static void main(String[] args) {

        Triangle a = new Triangle();
        a.setA(5);
        a.setB(6);
        a.setC(5);
        System.out.println(a.perimeterOfTriangle());
        System.out.println(a.squareOfTriangle());
        System.out.println(a.getA());
        System.out.println(a.toString());

        Triangle b = new Triangle(3, 3, 3);
        System.out.println(b.getA());
        System.out.println(b.getB());
        System.out.println(b.getC());
        System.out.println(b.perimeterOfTriangle());
        System.out.println(b.squareOfTriangle());
        System.out.println(b.toString());

        Product h = new Product("Pen", 123, 3, "Red color, Gel", true);
        h.isAvailability();
        Product g = new Product("Pen", 124, 3, "Blue color, Gel", false);
        g.isAvailability();
        System.out.println(g.getProductDescription());


        Employee first = new Employee("Petya", "Petrenko", "Developer", 35);
        first.calculateSalary(100);

        Credit myCredit = new Credit(2000, 1);
        System.out.println(myCredit.calculateMonthPayment(5));

        Credit one =new Credit();
        one.setAmountOfCredit(1000);
        one.setPresent(1);
        one.setTermMonth(10);
        System.out.println(one.calculateSumOverpayment());
    }
}