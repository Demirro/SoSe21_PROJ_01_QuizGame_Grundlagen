package de.uk.java.game;

import java.io.IOException;

import de.uk.java.gui.GUI;
import de.uk.java.questions.Questions;

public class QuizGame {

	public static void main(String[] args) {
		new QuizGame();
	}
	public QuizGame() {
		GUI gui = new GUI();
		Questions questions = new Questions();
		/*try {
			questions.setQuestions(QuestionFileReader.getQuestions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
