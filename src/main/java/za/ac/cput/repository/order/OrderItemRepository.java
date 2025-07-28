package za.ac.cput.repository.order;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.order.OrderItem;

import java.util.Optional;

@Repository
public interface OrderItemRepository  extends JpaRepository<OrderItem, Long> {
    Optional<OrderItem> findByTotalPrice(float price);
    Optional<OrderItem> findByPricePerItem(float pricePerItem);
    Optional<OrderItem> findByQuantity(long quantity);
}
