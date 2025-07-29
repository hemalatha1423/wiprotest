package day4;
public class main {
    public static void main(String [] args) {
        Product product = new Product();

        product.setProductName("Laptop");
        product.setProductCode("LT01233");
        product.setPrice(1100.00);

        product.applyDiscount(8);

        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Product Code: " + product.getProductCode());
        System.out.println("Price after discount: $" + product.getPrice());
    }
 }
