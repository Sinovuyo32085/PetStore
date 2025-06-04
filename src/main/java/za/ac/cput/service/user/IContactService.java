package za.ac.cput.service.user;

import za.ac.cput.domain.user.Contact;
import za.ac.cput.service.IService;

import java.util.List;

public interface IContactService extends IService<Contact, Integer> {
    List<Contact> getAll();

    Contact findByEmail(String email);

    Contact findByPhone(String phone);
}
