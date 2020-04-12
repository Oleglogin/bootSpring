package login.group.dao;

import login.group.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by User on 12.04.2020.
 */
public interface UserDaO extends JpaRepository<User, Integer> {

}
