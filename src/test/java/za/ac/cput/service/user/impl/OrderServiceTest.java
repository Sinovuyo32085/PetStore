package za.ac.cput.service.user.impl;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.order.OrderItem;
import za.ac.cput.domain.order.Status;
import za.ac.cput.domain.order.Order;
import za.ac.cput.factory.order.OrderFactory;
import za.ac.cput.factory.order.OrderItemFactory;
import za.ac.cput.service.order.impl.OrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest()
@TestMethodOrder(MethodOrderer.MethodName.class)
class OrderServiceTest {
    @Autowired
    private OrderService service;
    @Test
    void a_create() {
OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);        LocalDate orderDate = LocalDate.now();
          LocalDate deliveryDate = LocalDate.parse("2025-05-10");
          Status status = Status.Busy;
          List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);

        System.out.println("Order to be created: " + order);
        Order created = service.create(order);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    void b_read() {
OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-08-10");
        Status status = Status.Busy;
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);
        System.out.println("Order read +"+order);
        assertNotNull(order);

        Order read= service.read(order.getOrderID());
        assertNotNull(read);
        System.out.println("read: " +read);
    }

    @Test
    void c_update() {
OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        Status status = Status.Busy;
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);


        assertNotNull(order);
        Order newOrder = new Order.Builder().copy(order).setPrice(30000).build();
        Order updatedOrder = service.update(newOrder);
        assertNotNull(updatedOrder);
        System.out.println(updatedOrder);
    }

    @Test
    @Disabled
    void d_delete() {
OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        Status status = Status.Busy;
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);


        boolean deleted = service.delete(order.getOrderID());
        assertNotNull(deleted);
        System.out.println(deleted);
    }

    @Test
    void e_getAll() {
OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        Status status = Status.Busy;
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);

        System.out.println(service.getAll());
    }

    @Test
    void f_findByOrderDate() {
OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        Status status = Status.Busy;
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);

        assertNotNull(service.findByOrderDate(orderDate));
        System.out.println(service.findByOrderDate(orderDate));
    }

    @Test
    void g_findByDeliveryDate() {
OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        Status status = Status.Busy;
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);

        assertNotNull(service.findByDeliveryDate(deliveryDate));
        System.out.println(service.findByDeliveryDate(deliveryDate));
    }

    @Test
    void h_findByTotalPrice() {
OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,50,100,10);        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        Status status = Status.Busy;
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        Order order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);

        assertNotNull(service.findByPrice(order.getPrice()));
        System.out.println(service.findByPrice(order.getPrice()));
    }

    @Test
    void i_findByStatus() {

        Status status = Status.Busy;

        assertNotNull(service.findByStatus(status));
        System.out.println(service.findByStatus(status));
    }
}