package login.group.dao;

import login.group.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by User on 12.04.2020.
 */
public interface UserDAO extends JpaRepository<User, Integer> {

    @Query("from User u where u.username =:username")
    User findByUserName(@Param("username") String username);
}
