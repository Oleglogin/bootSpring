package login.group.service;

import login.group.entity.Product;

import java.util.List;

/**
 * Created by User on 12.04.2020.
 */
public interface ProductService {
    void save(Product product);
    void delete(Product product);
    List<Product> productList();
}
