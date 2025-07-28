package za.ac.cput.service.order;

import za.ac.cput.domain.order.Order;
import za.ac.cput.domain.order.Status;
import za.ac.cput.service.IService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IOrderService extends IService<Order,Long> {
    List<Order>getAll();
    Optional<Order> findByOrderDate(LocalDate orderDate);

    Optional<Order> findByDeliveryDate(LocalDate deliveryDate);

    Optional<Order> findByPrice(float price);

    Optional<Order> findByStatus(Status status);
}
