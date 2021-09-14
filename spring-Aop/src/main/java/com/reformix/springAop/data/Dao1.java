package com.reformix.springAop.data;

import org.springframework.stereotype.Repository;

import com.reformix.springAop.aspect.TrackTime;

@Repository
public class Dao1 {
	@TrackTime
	public String retriveSomething() {
		return "Dao1";
	}

}
