package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvice implements ExpertAdvice {
@Override
	
	public String getExpertAdvice() {
		
		return "do practice for 4 hrs a day";
		
	}

}
