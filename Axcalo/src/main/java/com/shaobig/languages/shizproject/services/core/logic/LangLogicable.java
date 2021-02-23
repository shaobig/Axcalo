package com.shaobig.languages.shizproject.services.core.logic;

public interface LangLogicable {
	int getCode(char s);
	int getAverage(char a, char b);
	
	double getRatioCode(int value);
	double getDerivativeCode(double value);
	
	int getOutputCode(double value);
}
