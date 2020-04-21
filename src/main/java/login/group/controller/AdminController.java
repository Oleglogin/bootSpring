package login.group.controller;

import login.group.entity.Product;
import login.group.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 15.04.2020.
 */
@Controller
public class AdminController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/admin")
    public String toAdmin(Model model){
        model.addAttribute("emptyProduct", new Product());
        model.addAttribute("productList", productService.productList());
        return "admin";
    }
}
