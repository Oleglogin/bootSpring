package login.group.dao;

import login.group.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

/**
 * Created by User on 13.04.2019.
 */
public interface ProductDAO extends JpaRepository<Product, Integer> {


}
