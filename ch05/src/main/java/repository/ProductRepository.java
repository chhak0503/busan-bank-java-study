package repository;

import entity.shop.OrderItem;
import entity.shop.Product;
import jpa.JpaRepository;

public class ProductRepository extends JpaRepository<Product, Integer> {
    public ProductRepository() {
        super(Product.class);
    }
}
