import java.util.Date;

public class NonGrocery implements Product{
    private static int nonGroseryCount;
    private String creationDate = String.valueOf(new Date());
    private String expirationTerm = "1 year";

    public NonGrocery()
    {
        nonGroseryCount++;
    }

    public String getCreationDate(){
        return this.creationDate;
    }
    public String getExpirationTerm(){
        return this.expirationTerm;
    }
    public static String getNonGroseryCount() {
        return "Total " + String.valueOf(nonGroseryCount)+" non-grocery product created";
    }
    @Override
    public String getInfo() {
        return "You pay a non-grocery product \n" + "Creation Date -" +getCreationDate()
                + "\nExpiration Term - " + getExpirationTerm();
    }
}
