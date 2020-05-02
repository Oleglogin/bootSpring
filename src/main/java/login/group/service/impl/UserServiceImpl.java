package login.group.service.impl;

import login.group.dao.UserDAO;
import login.group.entity.User;
import login.group.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService{
    @Autowired
    UserDAO userDAO;

    @Autowired
    PasswordEncoder passwordEncoder;

    AuthenticationManager authenticationManager;


    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDAO.save(user);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getOne(id);
    }

    public void delete(int id) {
        userDAO.deleteById(id);
    }

    public List<User> listUsers() {
        return userDAO.findAll();
    }

    public User findByUserName(String username) {
        return userDAO.findByUserName(username);
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByUserName(username);
    }

}


