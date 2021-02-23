package com.shaobig.languages.shizproject.services.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaobig.languages.shizproject.services.core.logic.QyhiybLogic;
import com.shaobig.languages.shizproject.services.core.logic.LangLogic;
import com.shaobig.languages.shizproject.services.core.logic.dictionary.LanguageName;

@Service
public class MainService {
	
	@Autowired
	private LangLogic logic;
	
	public String translate(String input, String language) {
		LanguageName lang = getLanguageName(language);
		
		logic.setText(input.trim());
		((QyhiybLogic)logic).setLanguage(lang);
		
		return logic.translate();
	}
	
	private LanguageName getLanguageName(String language) {
		return LanguageName.valueOf(language.toUpperCase());
	}
}
