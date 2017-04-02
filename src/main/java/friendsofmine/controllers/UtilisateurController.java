package friendsofmine.controllers;

import friendsofmine.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Hades on 4/1/17.
 */

@Controller
public class UtilisateurController {
    @Autowired
    private Bootstrap bootstrap;

    @GetMapping(value = "/utilisateurs")
    public String list(Model model){
        model.addAttribute("utilisateurs", bootstrap.getInitialisationService().getUtilisateurs());
        return "utilisateurs";
    }
}
