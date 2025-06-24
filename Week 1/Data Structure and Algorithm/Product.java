public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }


    //getter
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;

    }
    
    public String getCategory() {
        return category;
    }
    
}
