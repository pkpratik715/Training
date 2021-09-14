package com.reformix.springAop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reformix.springAop.data.Dao2;

@Service
public class Business2 {
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething() {
		return dao2.retriveSomething();
	}

}
