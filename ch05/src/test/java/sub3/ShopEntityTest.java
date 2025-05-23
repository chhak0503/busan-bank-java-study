package sub3;

import entity.shop.Order;
import entity.shop.OrderItem;
import org.junit.jupiter.api.Test;
import repository.CustomerRepository;
import repository.OrderItemRepository;
import repository.OrderRepository;
import repository.ProductRepository;

public class ShopEntityTest {

    CustomerRepository customerRepository = new CustomerRepository();
    OrderRepository orderRepository = new OrderRepository();
    OrderItemRepository orderItemRepository = new OrderItemRepository();
    ProductRepository productRepository = new ProductRepository();

    @Test
    public void test1(){

        Order order = orderRepository.findById(3);
        System.out.println(order);

        for(OrderItem orderItem : order.getOrderItems()){
            System.out.println(orderItem);
        }

    }

}
