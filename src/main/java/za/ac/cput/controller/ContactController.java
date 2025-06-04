package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.user.Contact;
import za.ac.cput.service.user.impl.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private ContactService service;

    @Autowired
    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Contact create(@RequestBody Contact contact) {
        return service.create(contact);
    }

    @GetMapping("/read/{id}")
    public Contact read(@PathVariable int id) {
        return service.read(id);
    }

    @PutMapping("/update")
    public Contact update(@RequestBody Contact contact) {
        return service.update(contact);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/getAll")
    public List<Contact> getAll() {
        return service.getAll();
    }

    @GetMapping("/findByEmail/{email}")
    public Contact findByEmail(@PathVariable String email) { return this.service.findByEmail(email); }

    @GetMapping("findByPhone/{phone}")
    public Contact findByPhone(@PathVariable String phone) { return this.service.findByPhone(phone); }
}