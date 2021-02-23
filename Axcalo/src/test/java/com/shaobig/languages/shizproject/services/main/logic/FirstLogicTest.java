package com.shaobig.languages.shizproject.services.main.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.shaobig.languages.shizproject.services.core.logic.QyhiybLogic;
import com.shaobig.languages.shizproject.services.core.logic.dictionary.LanguageName;

public class FirstLogicTest {
	
	private QyhiybLogic logic;
	
	@Before
	public void setUp() {
		String text = "ROMA";
		LanguageName language = LanguageName.ESDOPE;
		
		this.logic = new QyhiybLogic(text, language);
	}
	
	@Test
	public void testGetCode() {
		int expected = 82;
		
		int index = 0;
		int reality = logic.getCode(logic.getText().charAt(index));
		
		assertEquals(expected, reality);
	}
	
	@Test
	public void testGetAverage() {
		char a = logic.getText().charAt(0);
		char b = logic.getText().charAt(1);
		
		int expected = 80;
		int reality = logic.getAverage(a, b);
		
		assertEquals(expected, reality);
	}
	
	@Test
	public void testSum() {
		int expected = 303;
		int reality = logic.getSum("ROMA");
		
		assertEquals(expected, reality);
	}
	
	@Test
	public void testRatioCode() {
		logic.setSum(logic.getSum("ROMA"));
		
		double expected = 3.788;
		
		int average = 80;
		double reality = logic.getRatioCode(average);
		
		assertEquals(expected, reality, 3);
	}
	
	@Test
	public void testDerivativeCode() {
		double expected = 0.788;
		
		double ratio = 3.788;
		double reality = logic.getDerivativeCode(ratio);
		
		assertEquals(expected, reality, 3);
	}
	
	@Test
	public void testOutputCode() {
		int expected = 189;
		
		double value = 0.788;
		int reality = logic.getOutputCode(value);
		
		assertEquals(expected, reality);
	}
	
	@Test
	public void testGetWord() {
		String expected = "URXUG";
		String reality = logic.getWord("ROMA");
		
		assertEquals(expected, reality);
	}
	
	@Test
	public void translate() {
		logic.setText("ROMA ROMA");
		
		String expected = "URXUG URXUG";
		String reality = logic.translate();
		
		assertEquals(expected, reality);
	}

}
