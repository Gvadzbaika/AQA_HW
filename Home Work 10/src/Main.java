public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Product milk = factory.getProduct(TypeOfProduct.GROCERY);
        Product kefir = factory.getProduct(TypeOfProduct.GROCERY);
        Product bread = factory.getProduct(TypeOfProduct.GROCERY);
        Product book = factory.getProduct(TypeOfProduct.NONGROSERY);
        Product toy = factory.getProduct(TypeOfProduct.NONGROSERY);
        Product book2 = new NonGrocery();
        Product iceCream =new Grocery();
        Product milk2= new Grocery();
        Product milk3= new Grocery();
        Product toy2 = new NonGrocery();

        System.out.println(factory.printCount());
        System.out.println(Grocery.getGroseryCount());
        System.out.println(NonGrocery.getNonGroseryCount());
        
        System.out.println(milk.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(Grocery.getGroseryCount());

    }
}