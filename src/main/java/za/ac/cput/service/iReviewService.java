package za.ac.cput.service;

import za.ac.cput.domain.Review;

import java.util.List;

public interface iReviewService extends IService<Review, Integer> {
    List<Review> getAll();
}

