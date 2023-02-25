public class Product {
    private String type;
    private int code;
    private double price;
    private String productDescription;
    private boolean availability;

    public Product() {
        super();
    }
    public Product(String type, int code, double price, String productDescription, boolean availability) {
        this.type = type;
        this.code = code;
        this.price = price;
        this.productDescription = productDescription;
        this.availability = availability;

    }
       public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void isAvailability() {
        if (availability) {
            System.out.println("Available");
        } else {
            System.out.println("Not available");
        }
    }
}
