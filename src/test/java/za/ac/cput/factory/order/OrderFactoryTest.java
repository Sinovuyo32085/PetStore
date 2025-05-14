package za.ac.cput.factory.order;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.order.Order;
import za.ac.cput.domain.order.OrderItem;
import za.ac.cput.domain.order.Status;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OrderFactoryTest {
    private static LocalDate orderDate = LocalDate.now();
    private static LocalDate deliveryDate = LocalDate.parse("2025-05-10");
    private static OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,100.00);
    private static Status status = Status.Busy;
    private static List<OrderItem> orderItems = new ArrayList<>();
    @Test
    void createOrder() {
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);
        assertNotNull(order);
        System.out.println(order.toString());
    }

    @Test
    void createOrderWithoutOrderDate() {
        orderItems.add(orderItem);
        Order orderWithInvalidOrderDate = OrderFactory.createOrder(1,1,null,deliveryDate,8000,orderItems,status);
        assertNotNull(orderWithInvalidOrderDate);
        System.out.println(orderWithInvalidOrderDate.toString());
    }
    @Test
    void createOrderWithInvalidDeliveryDate() {
       orderItems.add(orderItem);
        Order orderWithInvalidDeliveryDate = OrderFactory.createOrder(1,1,orderDate,null,8000,orderItems,status);
        assertNotNull(orderWithInvalidDeliveryDate);
        System.out.println(orderWithInvalidDeliveryDate.toString());
    }
    @Test
    void createOrderWithoutOrderItems() {
        orderItems.add(orderItem);
        Order orderWithInvalidOrderItems = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,null,status);
        assertNotNull(orderWithInvalidOrderItems);
        System.out.println(orderWithInvalidOrderItems.toString());
    }
    @Test
    void createOrderWithoutStatus() {
        orderItems.add(orderItem);
        Order orderWithInvalidStatus = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,null);
        assertNotNull(orderWithInvalidStatus);
        System.out.println(orderWithInvalidStatus.toString());
    }
}