package tigerteam.seminaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calendrier")
public class CalendrierController {
    @GetMapping("/add")
    public  String calendrier(){
        return "seminaire_client/seminaire_calendrier/calendrier";
    }
}
