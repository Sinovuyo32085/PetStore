package za.ac.cput.domain;

import jakarta.persistence.*;
import za.ac.cput.domain.product.Product;
import za.ac.cput.domain.user.User;
@Entity
public class Review {

    @Id
    private int reviewId;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    @ManyToOne
    @JoinColumn(name = "productID")
    private Product product;

    private String review;
    private Float rating;

    protected Review() {}

    private Review(Builder builder) {
        this.reviewId = builder.reviewId;
        this.user = builder.user;
        this.product = builder.product;
        this.review = builder.review;
        this.rating = builder.rating;
    }

    public int getReviewId() {
        return reviewId;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public String getReview() {
        return review;
    }

    public Float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", user=" + user +
                ", product=" + product +
                ", review='" + review + '\'' +
                ", rating=" + rating +
                '}';
    }

    public static class Builder {
        private int reviewId;
        private User user;
        private Product product;
        private String review;
        private Float rating;

        public Builder setReviewId(int reviewId) {
            this.reviewId = reviewId;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }

        public Builder setReview(String review) {
            this.review = review;
            return this;
        }

        public Builder setRating(Float rating) {
            this.rating = rating;
            return this;
        }

        public Builder copy(Review review) {
            this.reviewId = review.reviewId;
            this.user = review.user;
            this.product = review.product;
            this.review = review.review;
            this.rating = review.rating;
            return this;
        }

        public Review build() {
            return new Review(this);
        }
    }
}
