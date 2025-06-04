package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Review;
import za.ac.cput.repository.ReviewRepository;
import za.ac.cput.service.iReviewService;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements iReviewService {

    private final ReviewRepository repository;

    @Autowired
    public ReviewService(ReviewRepository repository) {
        this.repository = repository;
    }

    @Override
    public Review create(Review review) {
        return repository.save(review);
    }

    @Override
    public Review read(Integer id) {
        Optional<Review> optional = repository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Review update(Review review) {

        if (repository.existsById(review.getReviewId())) {
            return repository.save(review);
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Review> getAll() {
        return repository.findAll();
    }

}
