package tigerteam.seminaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actus")
public class AstusController {
    @GetMapping("/find")
    public String find()
    {
        return "seminaire_client/seminaire_actus/find_actus";
    }
}
