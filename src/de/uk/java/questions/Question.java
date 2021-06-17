package de.uk.java.questions;

public abstract class Question {
	
	private String category; //maybe Enums
	private String prompt;
	
	public Question (String category, String prompt) {
		setCategory(category);
		setPrompt(prompt);
	}
	
	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
