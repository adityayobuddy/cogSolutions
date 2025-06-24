public class SearchFunctions {

    //linear search

    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {

            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;

            }
        }
        return null;
    }

    //binary search
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            int target = products[mid].productName.compareToIgnoreCase(targetName);

            if (target == 0) {
                return products[mid];

            } else if (target < 0) {
                left = mid + 1;

            } else {
                right = mid - 1;

            }
        }

        return null; 
    }
}
