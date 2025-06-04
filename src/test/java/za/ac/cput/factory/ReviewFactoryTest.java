/*
   Nkheso Senior Mathebula 230762883
*/
package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Review;

import static org.junit.jupiter.api.Assertions.*;

class ReviewFactoryTest {

    private static final Review validReview = ReviewFactory.createReview(1, 1001, 2001, "Great product!", 4.5f);
    private static final Review nullReviewText = ReviewFactory.createReview(2, 1002, 2002, null, 3.5f);
    private static final Review emptyReviewText = ReviewFactory.createReview(3, 1003, 2003, "", 3.5f);
    private static final Review invalidRatingLow = ReviewFactory.createReview(4, 1004, 2004, "Too bad", -1.0f);
    private static final Review invalidRatingHigh = ReviewFactory.createReview(5, 1005, 2005, "Too perfect", 6.0f);

    @Test
    void createReviewWithValidData() {
        assertNotNull(validReview);
        System.out.println(validReview);
    }

    @Test
    void createReviewWithNullText() {
        assertNull(nullReviewText);
        System.out.println(nullReviewText);
    }

    @Test
    void createReviewWithEmptyText() {
        assertNull(emptyReviewText);
        System.out.println(emptyReviewText);
    }

    @Test
    void createReviewWithInvalidLowRating() {
        assertNull(invalidRatingLow);
        System.out.println(invalidRatingLow);
    }

    @Test
    void createReviewWithInvalidHighRating() {
        assertNull(invalidRatingHigh);
        System.out.println(invalidRatingHigh);
    }
}
