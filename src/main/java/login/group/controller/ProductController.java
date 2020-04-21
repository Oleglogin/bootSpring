package login.group.controller;

import login.group.entity.Product;
import login.group.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by User on 12.04.2020.
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product/add", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("emptyProduct")Product product){
        productService.save(product);
        return "redirect:/admin";
    }
}
