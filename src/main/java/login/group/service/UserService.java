package login.group.service;

import login.group.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by User on 12.04.2020.
 */
public interface UserService {
    void save(User user);
    User getUserById(int id);
    void delete(int id);
    List<User> listUsers();
    User findByUserName(String username);
}
