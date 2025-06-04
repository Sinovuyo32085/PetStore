package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Wishlist;
import za.ac.cput.repository.WishlistRepository;
import za.ac.cput.service.iWishlistService;

import java.util.List;
import java.util.Optional;

@Service
public class WishlistService implements iWishlistService {

    private final WishlistRepository repository;

    @Autowired
    public WishlistService(WishlistRepository repository) {
        this.repository = repository;
    }

    @Override
    public Wishlist create(Wishlist wishlist) {
        return repository.save(wishlist);
    }

    @Override
    public Wishlist read(Integer id) {
        Optional<Wishlist> optional = repository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Wishlist update(Wishlist wishlist) {
        if (repository.existsById(wishlist.getWishlistId())) {
            return repository.save(wishlist);
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
    public List<Wishlist> getAll() {
        return repository.findAll();
    }


}

