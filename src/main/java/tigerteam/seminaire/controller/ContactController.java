package tigerteam.seminaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contact")
public class ContactController {

	@GetMapping("/contact")
	public String contact () {
		return "/seminaire_client/seminaire_contact/contact";
	}
}
