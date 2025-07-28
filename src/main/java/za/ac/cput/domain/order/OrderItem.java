package za.ac.cput.domain.order;

import jakarta.persistence.*;

/*
     OrderItem class
     Author: Sinovuyo Mathungana (230143725)
*/
@Entity
public class OrderItem{
    @Id
    private long orderItemID;
    private long productID;
    private float totalPrice;
    private long quantity;
    private float pricePerItem;
    protected OrderItem(){}



    private OrderItem(Builder builder){
        this.orderItemID = builder.orderItemID;
        this.productID = builder.productID;
        this.totalPrice = builder.totalPrice;
        this.quantity = builder.quantity;
    }

    public long getOrderItemID() {
        return orderItemID;
    }

    public long getProductID() {
        return productID;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public long getQuantity() {
        return quantity;
    }
    public float getPricePerItem() {
        return pricePerItem;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemID=" + orderItemID +
                ", productID=" + productID +
                ", totalPrice=" + totalPrice +
                ", quantity="+ quantity+
                ", pricePerItem=" + pricePerItem +
                '}';
    }
    public static class Builder{
        private long orderItemID;
        private long productID;
        private float totalPrice;
        private long quantity;
        private float pricePerItem;

        public Builder setOrderItemID(long orderItemID) {
            this.orderItemID = orderItemID;
            return this;
        }

        public Builder setProductID(long productID) {
            this.productID = productID;
            return this;
        }

        public Builder setTotalPrice(float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder setQuantity(long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Builder setPricePerItem(float pricePerItem) {
            this.pricePerItem = pricePerItem;
            return this;
        }
        public Builder copy(OrderItem orderitem){
            this.orderItemID = orderitem.orderItemID;
            this.productID = orderitem.productID;
            this.totalPrice = orderitem.totalPrice;
            this.quantity = orderitem.quantity;
            this.pricePerItem = orderitem.pricePerItem;
            return this;
        }
        public OrderItem build(){return new OrderItem(this);}
    }
}


