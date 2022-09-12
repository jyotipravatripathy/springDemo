package com.springConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springDemo.CricketCoach;
import com.springDemo.ExpertAdvice;
import com.springDemo.FootballCoach;
import com.springDemo.PracticeAdvice;
import com.springDemo.SportCoach;

@Configuration
@ComponentScan("com.springDemo")
public class SpringConfig {
	@Bean
	public ExpertAdvice practiceAdvice() {
		return new PracticeAdvice();
	}
	
	@Bean
	public SportCoach cricketCoach() {
		return new CricketCoach(practiceAdvice());
	}
	
	@Bean
	public SportCoach footballCoach() {
		return new FootballCoach();
	}
   
}
