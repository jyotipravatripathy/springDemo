package com.springDemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements SportCoach{
	private ExpertAdvice expertAdvice;
	
	public CricketCoach(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getTrainingScedule() {

		return "do practice at 6";
	}

	@Override
	public String getAdvice() {

		return expertAdvice.getExpertAdvice();
	}
	
	
	

}
