package login.group.service.impl;

import login.group.dao.UserDaO;
import login.group.entity.User;
import login.group.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by User on 12.04.2020.
 */
@Transactional
@Service
public class userServiceImpl implements UserService {
    @Autowired
    UserDaO userDaO;

    @Override
    public void save(User user) {
        userDaO.save(user);
    }

    @Override
    public void delete(User user) {
        userDaO.delete(user);
    }

    @Override
    public List<User> userList() {
        return userDaO.findAll();
    }
}
