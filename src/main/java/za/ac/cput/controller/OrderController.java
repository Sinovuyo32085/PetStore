package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.order.Order;
import za.ac.cput.service.order.impl.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private OrderService service;

    @Autowired
    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Order create(@RequestBody Order order){
        return service.create(order);
    }

    @GetMapping("/read/{id}")
    public Order read(@PathVariable long id){
        return service.read(id);
    }

    @PutMapping("/update")
    public Order update(@RequestBody Order order){
        return service.update(order);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id){
        return service.delete(id);
    }
    @GetMapping("/getAll")
    public List<Order> getAll(){
        return service.getAll();
    }

}
