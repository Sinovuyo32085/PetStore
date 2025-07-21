package za.ac.cput.service.order;

import za.ac.cput.domain.order.OrderItem;
import za.ac.cput.service.IService;

import java.util.List;
import java.util.Optional;

public interface IOrderItemService extends IService<OrderItem,Long> {
    List<OrderItem>getAll();
    Optional<OrderItem> findByTotalPrice(float totalPrice);
    Optional<OrderItem> findByPricePerItem(float pricePerItem);
    Optional<OrderItem> findByQuantity(long quantity);
}
