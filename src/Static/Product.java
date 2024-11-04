package Static;

public class Product {
    private static int counter=0;
    private final int id;
    private final String PRODUCT = "Product";
    public Product(){
        id=++counter;
    }
    public String getProductID(){
        return PRODUCT + id;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id =" + getProductID() +
                '}';
    }
}
