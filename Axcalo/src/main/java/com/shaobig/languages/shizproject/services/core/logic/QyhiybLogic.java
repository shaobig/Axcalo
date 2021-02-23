package com.shaobig.languages.shizproject.services.core.logic;

import com.shaobig.languages.shizproject.services.core.logic.dictionary.Language;
import com.shaobig.languages.shizproject.services.core.logic.dictionary.LanguageFactory;
import com.shaobig.languages.shizproject.services.core.logic.dictionary.LanguageName;

public class QyhiybLogic extends LangLogic implements WordReducer {
	
	private static final int MIN_LENGTH = 2;
	private static final int MAX_LENGTH = 10;
	
	private int sum;
	private Language language;

	public QyhiybLogic(String text) {
		super(text);
		this.language = LanguageFactory.getLanguage(LanguageName.ESDOPE);
	}
	
	public QyhiybLogic(String text, LanguageName language) {
		super(text);
		this.language = LanguageFactory.getLanguage(language);
	}

	@Override
	public int getCode(char s) {
		return (int) s;
	}

	@Override
	public int getAverage(char a, char b) {
		return (getCode(a) + getCode(b)) / 2;
	}

	@Override
	public double getRatioCode(int average) {
		return getSum() / (double) average;
	}

	@Override
	public double getDerivativeCode(double ratio) {
		int q = (int) (ratio / 1);
		return Math.abs(ratio - q);
	}

	@Override
	public int getOutputCode(double value) {
		return (int) (value * getLanguage().getMoraCount());
	}

	@Override
	public String translate() {
		String[] words = getText().split(" ");
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < words.length; i++) {
			setSum(getSum(words[i]));
			builder.append(getWord(words[i]));
			
			if (i <= words.length - 1) {
				builder.append(" ");
			}
		}
		
		return builder.toString();
	}
	
	public String getWord(String word) {
		if (word.length() == 0) {
			return "";
		}
		else if (word.length() == 1) {
			return word.toUpperCase();
		}
		else {
			StringBuilder builder = new StringBuilder();
			
			char a;
			char b;
			
			int averageCode;
			double ratio;
			double derivative;
			int index;
			
			for (int i = 0; i < word.length() - 1; i++) {
				a = word.charAt(i);
				b = word.charAt(i+1);
				
				averageCode = getAverage(a, b);
				ratio = getRatioCode(averageCode);
				derivative = getDerivativeCode(ratio);
				index = getOutputCode(derivative);
				
				builder.append(getLanguage().getMora(index));
			}
			
			String output = reduce(builder.toString());
			return output;
		}
	}

	@Override
	public int getSum(String text) {
		int sum = 0;
		char symbol;
		
		for (int i = 0; i < text.length(); i++) {
			symbol = text.charAt(i);
			sum += getCode(symbol);
		}
		
		return sum;
	}

	@Override
	public int getLength(String word) {
		return word.length() != MIN_LENGTH
				? (getSum() % (MAX_LENGTH - 1) % (word.length() - MIN_LENGTH)) + MIN_LENGTH
				: word.length();
	}

	@Override
	public String reduce(String word) {
		return word.substring(0, getLength(word));
	}
	
	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	public void setLanguage(LanguageName language) {
		this.language = LanguageFactory.getLanguage(language);
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
}
