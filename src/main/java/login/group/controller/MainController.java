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

//    private static List<Person> persons = new ArrayList<Person>();
//
//    static {
//        persons.add(new Person("Bill", "Gates"));
//        persons.add(new Person("Steve", "Jobs"));
//    }
//
//    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
//    public String index(Model entity) {
//
//        String message = "Hello Spring Boot + JSP";
//
//        entity.addAttribute("message", message);
//
//        return "index";
//    }
//
//    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
//    public String viewPersonList(Model entity) {
//
//        entity.addAttribute("persons", persons);
//
//        return "personList";
//    }

}