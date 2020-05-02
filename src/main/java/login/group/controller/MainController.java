package login.group.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by User on 12.04.2020.
 */
@Controller
public class MainController {
    @GetMapping(value ="/")
    public String toMainPage(Model model){
        return "welcome";
    }
    @GetMapping(value = "/welcome")
    public String toWelcome(){
        return "welcome";
    }


}