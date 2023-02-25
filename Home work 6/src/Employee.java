public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private double hourlyPrice;

    public Employee(){
        super();
    }
    public Employee(String firstName, String lastName, String position, double hourlyPrice){
        this.firstName=firstName;
        this.lastName=lastName;
        this.position=position;
        this.hourlyPrice=hourlyPrice;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getHourlyPrice(){
        return hourlyPrice;
    }
    public void setHourlyPrice(double hourlyPrice) {
        this.hourlyPrice = hourlyPrice;
    }
    public  void calculateSalary(double workingHour){
        double salary= hourlyPrice*workingHour;
        System.out.println("Salary:"+salary);
    }
}
