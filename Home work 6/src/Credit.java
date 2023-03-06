public class Credit {
    private double amountOfCredit;
    private int termMonth;
    private int present;
    private double amountInMonth;

    public Credit(){
        super();
    }
    public Credit(double amountOfCredit,int presentInMonth) {
        this.amountOfCredit = amountOfCredit;
        this.present = presentInMonth;
    }
    public Credit(double amountOfCredit, int termMonth, int presentInMonth) {
        this.amountOfCredit = amountOfCredit;
        this.termMonth = termMonth;
        this.present = presentInMonth;
    }
    public double getAmountOfCredit() {
        return amountOfCredit;
    }
    public void setAmountOfCredit(double amountOfCredit) {
        this.amountOfCredit = amountOfCredit;
    }
    public double getAmountInMonth() {
        return amountInMonth;
    }

    public void setAmountInMonth(double amountInMonth) {
        this.amountInMonth = amountInMonth;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }

    public int getTermMonth() {
        return termMonth;
    }

    public void setTermMonth(int termMonth) {
        this.termMonth = termMonth;
    }

    public double calculateMonthPayment(int termMonth) {
        double monthPayment;
        monthPayment = (amountOfCredit / termMonth)+ (amountOfCredit * present / 100);
        return monthPayment;
    }

    public double calculateSumOverpayment() {
        double sumOverpayment;
        sumOverpayment = (amountOfCredit * present / 100)*termMonth;
        return sumOverpayment;
    }


}
