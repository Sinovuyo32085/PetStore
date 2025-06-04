package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Wishlist;
import za.ac.cput.service.WishlistService;

import java.util.List;

@RestController
@RequestMapping("/wishlist")
public class WishlistController {

    private final WishlistService service;

    @Autowired
    public WishlistController(WishlistService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Wishlist create(@RequestBody Wishlist wishlist) {
        return service.create(wishlist);
    }

    @GetMapping("/read/{id}")
    public Wishlist read(@PathVariable int id) {
        return service.read(id);
    }

    @PutMapping("/update")
    public Wishlist update(@RequestBody Wishlist wishlist) {
        return service.update(wishlist);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/getAll")
    public List<Wishlist> getAll() {
        return service.getAll();
    }
}
