package com.reformix.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private UserValidationService validate = new UserValidationService();

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginHandler(@RequestParam String name,@RequestParam String password, ModelMap model) {
		if (!validate.validation(name, password)) {
			model.put("errmsg", "Invalid Credentials by MVC");
			return "login";
		}
		model.put("user", name);
		model.put("password", password);
		return "welcome";
	}
	
}
