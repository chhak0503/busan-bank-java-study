package repository;

import entity.shop.Order;
import entity.shop.OrderItem;
import jpa.JpaRepository;

public class OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    public OrderItemRepository() {
        super(OrderItem.class);
    }
}
