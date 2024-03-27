public class Product {
    int id;
    String product;

    // Constructor with parameters
    public Product(int i, String p) {
        id = i;
        product = p;
    }

    public static void main(String[] args) {
        // Creating an instance of Product with constructor arguments
        Product prd = new Product(1, "Example Product");

        // Accessing instance variables using the object
        System.out.println(prd.id + " " + prd.product);
    }
}
