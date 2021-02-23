package com.shaobig.languages.shizproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.shaobig.languages.shizproject.services.core.logic.LangLogic;
import com.shaobig.languages.shizproject.services.core.logic.QyhiybLogic;

@Configuration
@ComponentScan("com.shaobig.languages.shizproject.services")
public class AppLogicConfig {
	
	private static final String DEFAULT_INPUT = "World";
	
	@Bean
	public LangLogic langLogic() {
		return new QyhiybLogic(DEFAULT_INPUT);
	}
}
