package tigerteam.seminaire.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tigerteam.seminaire.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String login(){
        return "/seminaire_client/seminaire_user/login";
    }


    @GetMapping("/logon")
    public String logon(Model model){
        model.addAttribute("user", new User());
        return "/seminaire_client/seminaire_user/logon";
    }

    @GetMapping( "/logout" )
    public String logout( HttpSession session ) {
        session.invalidate();
        return "redirect:/";
    }


}
