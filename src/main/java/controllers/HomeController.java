package controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import models.Personne;
import validation.Validation;

@Controller
@RequestMapping(name = "/")
public class HomeController {
	@Autowired
	private Validation validation;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(validation);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getHomePage(Model model) {
		model.addAttribute("p", new Personne());
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String getMessage(@ModelAttribute("p") @Valid Personne p, BindingResult result) {
		if (result.hasErrors()) System.out.println("Error");
		else System.out.println(p);
		return "index";
	}
	
}