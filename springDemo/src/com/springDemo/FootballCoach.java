package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements SportCoach{
//	@Autowired
	private ExpertAdvice expertAdvice;
	

	public ExpertAdvice getExpertAdvice() {
		return expertAdvice;
	}
	@Autowired
	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getTrainingScedule() {
		// TODO Auto-generated method stub
		return "Practice at 8 am";
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getExpertAdvice();
	}

}
