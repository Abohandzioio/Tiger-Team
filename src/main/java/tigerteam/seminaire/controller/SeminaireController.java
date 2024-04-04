package tigerteam.seminaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tigerteam.seminaire.model.Seminaire;
import tigerteam.seminaire.service.SeminaireService;
import java.util.Optional;

@Controller
@RequestMapping("/seminaire")
public class SeminaireController {

    @Autowired
    SeminaireService seminaireService;

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("seminaire",new Seminaire());
        return "/seminaire_client/seminaire/add_seminaire";
    }

    @GetMapping("/show/{id}")
    public String shwo(Model model, @PathVariable int id){

        Optional<Seminaire> seminaire = Optional.ofNullable(seminaireService.getById(id));

        if(seminaire.isPresent()){

            model.addAttribute("seminaire", seminaire);
            return "/seminaire_client/seminaire/show_ seminaire";
        }

        return  "seminaire_client_seminaire_error/error_page";
    }

    //todo il s'agit ici de rechercher un séminaire dans la barre de recherche
    @GetMapping("/find")
    public String find(){
        return  "/seminaire_client/seminaire/find_seminaire";
    }


}
