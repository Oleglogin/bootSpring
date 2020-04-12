package login.group.service;

import login.group.entity.User;

import java.util.List;

/**
 * Created by User on 12.04.2020.
 */
public interface UserService {
    void save(User user);
    void delete(User user);
    List<User> userList();
}
