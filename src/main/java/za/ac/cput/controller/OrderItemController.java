package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.order.OrderItem;
import za.ac.cput.service.order.impl.OrderItemService;

import java.util.List;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

    private OrderItemService service;

    @Autowired
    public OrderItemController(OrderItemService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public OrderItem create(@RequestBody OrderItem orderItem){
        return service.create(orderItem);
    }

    @GetMapping("/read/{id}")
    public OrderItem read(@PathVariable long id){
        return service.read(id);
    }

    @PutMapping("/update")
    public OrderItem update(@RequestBody OrderItem orderItem){
        return service.update(orderItem);
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable long id){
        return service.delete(id);
    }
    @GetMapping("/getAll")
    public List<OrderItem> getAll(){
        return service.getAll();
    }
}
