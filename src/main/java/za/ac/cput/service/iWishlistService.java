package za.ac.cput.service;

import za.ac.cput.domain.Wishlist;

import java.util.List;

public interface iWishlistService extends IService<Wishlist, Integer> {
    List<Wishlist> getAll();
}
