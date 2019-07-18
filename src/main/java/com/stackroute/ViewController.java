package main.java.com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/")
    public String view(Model model) {
        User user = new User();
        user.setName("Lavanya");
        System.out.println(user.getName());
        model.addAttribute("name", user.getName());
        return "index";
    }
}
