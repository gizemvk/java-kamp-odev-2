public class Main {
    public static void main(String[] args) {


        Product product =new Product();
        product.name = "Laptop";
        product.id = 53;
        product.description = "Asus Laptop";
        product.price = 10000;
        product.stockAmount = 4;


        ProductManager productManager = new ProductManager();
        productManager.Add(product);























    }
}