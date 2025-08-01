package za.ac.cput.service.user;

import za.ac.cput.domain.user.User;
import za.ac.cput.service.IService;

import java.util.List;

public interface UserService extends IService<User, Long> {
    List<User> getAll();
}
