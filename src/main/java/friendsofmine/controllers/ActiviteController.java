package friendsofmine.controllers;

import friendsofmine.Bootstrap;
import friendsofmine.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Hades on 4/2/17.
 */
@Controller
public class ActiviteController {
    /*
    @Autowired

    private Bootstrap bootstrap;

    @GetMapping(value = "/activites")
    public String list(Model model){
        model.addAttribute("activites", bootstrap.getInitialisationService().getActivites());
        return "activites";
    }
    */
    @Autowired
    private ActiviteService activiteService;

    // équivalent à :
    // @RequestMapping(value = "/activites", method = RequestMethod.GET)
    @GetMapping(value = "/activites")
    public String list(Model model) {
        model.addAttribute("activites", activiteService.findAllActivites());
        return "activites";
    }
}
