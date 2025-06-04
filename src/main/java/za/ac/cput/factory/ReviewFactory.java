/*
   Nkheso Senior Mathebula 230762883
*/
package za.ac.cput.factory;

import za.ac.cput.domain.Review;
import za.ac.cput.domain.product.Product;
import za.ac.cput.domain.user.User;
import za.ac.cput.util.Helper;

public class ReviewFactory {
    public static Review createReview(int reviewId, User user, Product product, String review, Float rating) {
        if (user == null || product == null) return null;
        if (Helper.isNullOrEmpty(review)) return null;
        if (!Helper.isValidRating(rating)) return null;

        return new Review.Builder()
                .setReviewId(reviewId)
                .setUser(user)
                .setProduct(product)
                .setReview(review)
                .setRating(rating)
                .build();
    }
}

