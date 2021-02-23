package com.shaobig.languages.shizproject.services.core.logic;

public abstract class LangLogic implements LangLogicable, Summator, Translator {
	private String text;

	public LangLogic(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
