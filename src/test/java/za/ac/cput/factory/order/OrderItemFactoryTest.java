package za.ac.cput.factory.order;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.order.OrderItem;

import static org.junit.jupiter.api.Assertions.*;
class OrderItemFactoryTest {
private static OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,123.99);
   private static OrderItem OrderItemWithInvalidPrice = OrderItemFactory.createOrderItem(1,1,-123.99);

    @Test
    @Disabled
    void createOrderItem() {
        assertNotNull(orderItem);
        System.out.println(orderItem);
    }
    @Test
    void createOrderItemWithInvalidPrice() {
        assertNotNull(OrderItemWithInvalidPrice);
        System.out.println(OrderItemWithInvalidPrice);
    }
}