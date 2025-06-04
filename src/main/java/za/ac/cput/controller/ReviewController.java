/*
 * Nkheso Senior Mathebula 230762883
 */
package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Review;
import za.ac.cput.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private final ReviewService service;

    @Autowired
    public ReviewController(ReviewService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Review create(@RequestBody Review review) {
        return service.create(review);
    }

    @GetMapping("/read/{id}")
    public Review read(@PathVariable int id) {
        return service.read(id);
    }

    @PutMapping("/update")
    public Review update(@RequestBody Review review) {
        return service.update(review);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/getAll")
    public List<Review> getAll() {
        return service.getAll();
    }
}

