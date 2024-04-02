package tigerteam.seminaire.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tigerteam.seminaire.model.Seminaire;
import tigerteam.seminaire.service.SeminaireService;

@Controller
@RequestMapping("/seminaire")
public class SeminaireController {

    @Autowired
    SeminaireService seminaireService;
    @GetMapping("/add")
    public void add(Seminaire seminaire){

    }
}
