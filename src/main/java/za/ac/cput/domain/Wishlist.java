package za.ac.cput.domain;

import jakarta.persistence.*;
import za.ac.cput.domain.product.Product;
import za.ac.cput.domain.user.User;

import java.util.List;

@Entity
public class Wishlist {

    @Id
    private int wishlistId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userID")
    private User user;

    @ManyToMany
    @JoinTable
    private List<Product> items;

    protected Wishlist() {}

    private Wishlist(Builder builder) {
        this.wishlistId = builder.wishlistId;
        this.user = builder.user;
        this.items = builder.items;
    }

    public int getWishlistId() {
        return wishlistId;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Wishlist{" +
                "wishlistId=" + wishlistId +
                ", user=" + user +
                ", items=" + items +
                '}';
    }

    public static class Builder {
        private int wishlistId;
        private User user;
        private List<Product> items;

        public Builder setWishlistId(int wishlistId) {
            this.wishlistId = wishlistId;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setItems(List<Product> items) {
            this.items = items;
            return this;
        }

        public Builder copy(Wishlist wishlist) {
            this.wishlistId = wishlist.wishlistId;
            this.user = wishlist.user;
            this.items = wishlist.items;
            return this;
        }

        public Wishlist build() {
            return new Wishlist(this);
        }
    }
}
