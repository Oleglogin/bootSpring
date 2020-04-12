package login.group.controller;

import login.group.entity.User;
import login.group.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by User on 12.04.2020.
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/registration")
    public String toRegistration(Model model){
        model.addAttribute("emptyUser", new User());
        return "registration";
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("emptyUser")User user){
        userService.save(user);
        return "redirect:/welcome";
    }
}
