package za.ac.cput.service.order.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.order.OrderItem;
import za.ac.cput.repository.order.OrderItemRepository;
import za.ac.cput.service.order.IOrderItemService;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService implements IOrderItemService {
    private OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemService(OrderItemRepository orderItemRepository){
        this.orderItemRepository =orderItemRepository;
    }


    @Override
    public OrderItem create(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public OrderItem read(Long id) {
        return orderItemRepository.findById(id).orElseThrow();
    }

    @Override
    public OrderItem update(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    @Override
    public boolean delete(Long id) {
        orderItemRepository.deleteById(id);
        return true;
    }
    @Override
    public Optional<OrderItem> findByTotalPrice(float totalPrice) {
        return orderItemRepository.findByTotalPrice(totalPrice);
    }
    @Override
    public Optional<OrderItem> findByPricePerItem(float pricePerItem) {
        return orderItemRepository.findByTotalPrice(pricePerItem);
    }
    @Override
    public Optional<OrderItem> findByQuantity(long quantity) {
        return orderItemRepository.findByQuantity(quantity);
    }

    @Override
    public List<OrderItem> getAll() {
        return orderItemRepository.findAll();
    }

}
