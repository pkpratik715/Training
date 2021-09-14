package com.reformix.jee;

public class UserValidationService {
	
	public boolean validation(String username , String password) {
		if (username.equals("Pratik") && password.equals("pkpratik715"))
			return true;
		
		return false;
	}

}
