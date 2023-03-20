public class ProductFactory {
    private int groseryCount;
    private int nonGroseryCount;
    public Product getProduct (TypeOfProduct type) {

        Product toReturn = null;
        switch (type) {
            case GROCERY:
                groseryCount++;
                toReturn = new Grocery();
                break;
            case NONGROSERY:
                nonGroseryCount++;
                toReturn = new NonGrocery();
                break;
            default:
                throw new IllegalArgumentException("Wrong product type:" + type);
        }
        return toReturn;
    }
    public String printCount() {
        return "Factory created " +groseryCount + " grocery products\n" +
                "Factory created " + nonGroseryCount + " non-grocery products";
    }
}
