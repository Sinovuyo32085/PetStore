package za.ac.cput.controller;

import org.aspectj.weaver.ast.Or;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import za.ac.cput.domain.order.OrderItem;
import za.ac.cput.domain.order.Order;
import za.ac.cput.domain.order.Status;
import za.ac.cput.factory.order.OrderFactory;
import za.ac.cput.factory.order.OrderFactory;
import za.ac.cput.factory.order.OrderItemFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)
class OrderControllerTest {

    private static Order order;

    @Autowired
    private TestRestTemplate restTemplate;

    private static final String BASE_URL = "http://localhost:8080/petstoretest/order";

    @BeforeAll
    public static void setUp() {
        LocalDate orderDate = LocalDate.now();
        LocalDate deliveryDate = LocalDate.parse("2025-05-10");
        OrderItem orderItem = OrderItemFactory.createOrderItem(1,1,100,50,25);
        Status status = Status.Busy;
        List<OrderItem> orderItems = new ArrayList<>();
        orderItems.add(orderItem);
        order = OrderFactory.createOrder(1,1,orderDate,deliveryDate,8000,orderItems,status);
    }

    @Test
    void a_create() {
        String url = BASE_URL + "/create";
        ResponseEntity<Order> postResponse = restTemplate.postForEntity(url,order, Order.class);
        assertNotNull(postResponse);
        Order createdOrder = postResponse.getBody();
        assertEquals(order.getOrderID(),createdOrder.getOrderID());
        System.out.println("Created " + createdOrder.toString());
    }

    @Test
    void b_read() {
        String url = BASE_URL + "/read/" + order.getOrderID();
        ResponseEntity<Order> readOrder =  this.restTemplate.getForEntity(url, Order.class);
        assertNotNull(readOrder);
        System.out.println(readOrder.toString());
    }

    @Test
    void c_update() {
        Order updateOrder = new Order.Builder().copy(order).setPrice(7000).build();
        String url = BASE_URL + "/update";
        ResponseEntity<Order> updated = restTemplate.postForEntity(url, updateOrder, Order.class);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    void e_delete() {
        String url = BASE_URL + "/delete/" + order.getOrderID();
        restTemplate.delete(url);

        String readUrl = BASE_URL + "/read/" + order.getOrderID();
        ResponseEntity<Order> reponse = restTemplate.getForEntity(readUrl, Order.class);
        assertEquals(HttpStatus.NOT_FOUND, reponse.getStatusCode());
        System.out.println("true");
    }

    @Test
    void d_getAll() {
        String url = BASE_URL + "/getAll";
        List<Order> orders = restTemplate.getForObject(url, List.class);
        assertNotNull(orders);
        System.out.println(orders);
    }
}