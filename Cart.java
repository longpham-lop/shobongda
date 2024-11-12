
package connecttosql;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);  // Thêm sản phẩm vào giỏ hàng
    }

    public void displayCart() {
        for (Product product : cartItems) {
            System.out.println(product);
        }
    }
}
