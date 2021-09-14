package com.reformix.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.reformix.jee.UserValidationService;

@Controller
public class LoginController {
	
	private UserValidationService validate = new UserValidationService();

	@RequestMapping(value = "/mvclogin", method = RequestMethod.GET)
	public String showMvcLoginPage() {
		return "mvclogin";
	}
	
	@RequestMapping(value = "/mvclogin", method = RequestMethod.POST)
	public String mvcLoginHandler(@RequestParam String name,@RequestParam String password, ModelMap model) {
		if (!validate.validation(name, password)) {
			model.put("errmsg", "Invalid Credentials");
			return "mvclogin";
		}
		model.put("user", name);
		model.put("password", password);
		return "mvcwelcome";
	}
	
}
