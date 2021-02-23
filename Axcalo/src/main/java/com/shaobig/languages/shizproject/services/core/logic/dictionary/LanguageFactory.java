package com.shaobig.languages.shizproject.services.core.logic.dictionary;

import com.shaobig.languages.shizproject.services.core.logic.dictionary.language.EsdopeLanguage;
import com.shaobig.languages.shizproject.services.core.logic.dictionary.language.IcezheLanguage;
import com.shaobig.languages.shizproject.services.core.logic.dictionary.language.OthxiakLanguage;

public class LanguageFactory {
	public static Language getLanguage(LanguageName language) {
		switch (language) {
			case ESDOPE: return new EsdopeLanguage();
			case ICEZHE: return new IcezheLanguage();
			case OTHXIAK: return new OthxiakLanguage();
			default: return new EsdopeLanguage();
		}
	}
}
