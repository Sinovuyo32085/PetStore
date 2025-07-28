package za.ac.cput.factory.order;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.order.OrderItem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class OrderItemFactoryTest {
    private static OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,123,4);
    private static OrderItem orderItemWithInvalidTotalPrice = OrderItemFactory.createOrderItem(1,1,50,-1000,4);
    private static OrderItem orderItemWithQuantity = OrderItemFactory.createOrderItem(1,1,-199,12,4);

    @Test
    void createOrderItem() {
        assertNotNull(orderItem);
        System.out.println(orderItem);
    }
    @Test
    void createOrderItemWithInvalidPrice() {
        assertNotNull(orderItemWithInvalidTotalPrice);
        System.out.println(orderItemWithInvalidTotalPrice);
    }
    @Test
    void createOrderItemWithInvalidQuantity() {
        assertNotNull(orderItemWithQuantity);
        System.out.println(orderItemWithQuantity);
    }
}