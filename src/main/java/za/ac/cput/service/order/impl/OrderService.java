package za.ac.cput.service.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.order.Order;
import za.ac.cput.domain.order.Status;
import za.ac.cput.repository.order.OrderRepository;
import za.ac.cput.service.order.IOrderService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService implements IOrderService {

    private OrderRepository orderRepository ;

    @Autowired
    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;}

    @Override
    public Order create(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order read(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public boolean delete(Long id) {
        orderRepository.deleteById(id);
        return true;
    }
    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findByOrderDate(LocalDate orderDate) {
        return orderRepository.findByOrderDate(orderDate);
    }

    @Override
    public Optional<Order> findByDeliveryDate(LocalDate deliveryDate) {
        return orderRepository.findByDeliveryDate(deliveryDate);
    }

    @Override
    public Optional<Order> findByPrice(float price) {
        return orderRepository.findByPrice(price);
    }

    @Override
    public Optional<Order> findByStatus(Status status) {
        return orderRepository.findByStatus(status);
    }


}
