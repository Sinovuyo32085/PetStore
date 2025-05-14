package za.ac.cput.factory.order;

import za.ac.cput.domain.order.OrderItem;
import za.ac.cput.util.Helper;

public class OrderItemFactory {
    public static OrderItem createOrderItem(
            int orderItemID,
            int productID,
            double price
    ){
        if(Helper.isValidPrice(price) ){
            return null;
        }
        return new OrderItem.Builder()
                .setOrderItemID(orderItemID)
                .setProductID(productID)
                .setPrice(price)
                .build();
    }
}
