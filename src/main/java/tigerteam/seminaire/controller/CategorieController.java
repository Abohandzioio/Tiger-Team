package tigerteam.seminaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categorie")
public class CategorieController {
    @GetMapping("/add")
    public String add(){
        return "seminaire_client/seminaire_categorie/add_categorie";
    }
}
