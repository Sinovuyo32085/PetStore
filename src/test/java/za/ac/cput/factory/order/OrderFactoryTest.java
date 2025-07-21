package za.ac.cput.factory.order;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.order.Order;
import za.ac.cput.domain.order.OrderItem;
import za.ac.cput.domain.order.Status;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OrderFactoryTest {

    @Test
    void createOrder() {
        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Status status = Status.Busy;

        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);
        assertNotNull(order);
        System.out.println(order.toString());
    }

    @Test
    void createOrderWithoutOrderDate() {
        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Status status = Status.Busy;

        Order orderWithInvalidOrderDate = OrderFactory.createOrder(1,1,null,deliveryDate,8000,orderItems,status);
        assertNotNull(orderWithInvalidOrderDate);
        System.out.println(orderWithInvalidOrderDate.toString());
    }
    @Test
    void createOrderWithInvalidDeliveryDate() {
        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Status status = Status.Busy;
        Order orderWithInvalidDeliveryDate = OrderFactory.createOrder(1,1,orderDate,null,8000,orderItems,status);
        assertNotNull(orderWithInvalidDeliveryDate);
        System.out.println(orderWithInvalidDeliveryDate.toString());
    }
    @Test
    void createOrderWithoutOrderItems() {
        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Status status = Status.Busy;

        Order orderWithInvalidOrderItems = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,null,status);
        assertNotNull(orderWithInvalidOrderItems);
        System.out.println(orderWithInvalidOrderItems.toString());
    }
    @Test
    void createOrderWithInvalidStatus() {
        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Status status = Status.Busy;

        Order orderWithInvalidStatus = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,null);
        assertNotNull(orderWithInvalidStatus);
        System.out.println(orderWithInvalidStatus.toString());
    }
}