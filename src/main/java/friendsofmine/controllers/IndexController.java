package friendsofmine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hades on 4/1/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}
