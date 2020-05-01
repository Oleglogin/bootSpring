package login.group.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by User on 21.04.2020.
 */
@Controller
public class LoginController {

    @GetMapping(value = "login")
    public String toLogin(){
        return "/login";
    }
}
