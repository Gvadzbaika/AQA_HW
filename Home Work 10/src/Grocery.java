import java.util.Date;

public class Grocery implements Product {
    private static int groseryCount;
    private String creationDate = String.valueOf(new Date());
    private String warrantyPeriod = "1 week";

    public Grocery()
    {
        groseryCount++;
    }

    public String getCreationDate(){
        return this.creationDate;
    }
    public String getWarrantyPeriod(){
        return this.warrantyPeriod;
    }
    public static String getGroseryCount() {
        return "Total " + String.valueOf(+groseryCount)+" grocery product created";
    }
    @Override
    public String getInfo() {
        return "You pay a grocery product \n" + "Creation Date -" +getCreationDate()
                + "\nWarranty period - " + getWarrantyPeriod();
    }
}
