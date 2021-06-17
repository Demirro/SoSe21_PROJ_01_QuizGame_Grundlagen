package de.uk.java.questions;

public class BoolQuestion extends Question {

	private boolean correctAnswer;
	
	public BoolQuestion(String category, String prompt, boolean answer) {
		super(category, prompt);
		setAnswer(answer);
	}
	
	public void setAnswer(boolean answer) {
		this.correctAnswer = answer;
	}
	
	public boolean getAnswer() {
		return correctAnswer;
	}

}
