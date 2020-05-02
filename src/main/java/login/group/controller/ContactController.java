package login.group.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by User on 22.04.2019.
 */
@Controller
public class ContactController {
    @RequestMapping(value = "/contact")
    public String toContact(){
        return "/contact";
    }
}
