package za.ac.cput.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.user.Contact;
import za.ac.cput.repository.user.ContactRepository;
import za.ac.cput.service.user.IContactService;

import java.util.List;

@Service
public class ContactService implements IContactService {

    private ContactRepository repository;

    @Autowired
    public ContactService(ContactRepository repository) { this.repository = repository; }

    @Override
    public Contact create(Contact contact) {
        return repository.save(contact);
    }

    @Override
    public Contact read(Integer id) {
        return repository.getReferenceById(id);
    }

    @Override
    public Contact update(Contact contact) {
        return repository.save(contact);
    }

    @Override
    public boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<Contact> getAll() {
        return repository.findAll();
    }

    @Override
    public Contact findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Contact findByPhone(String phone) {
        return repository.findByPhone(phone);
    }
}
