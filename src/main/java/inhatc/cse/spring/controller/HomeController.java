package inhatc.cse.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//
@Controller
public class HomeController {

    @RequestMapping( "/")
    public String home(Model model){
        model.addAttribute("num","1234567");
        return "home";
    }

}
