package edu.unca.csci201;

import java.util.ArrayList;

public class Quiz {
	private int score;
	public ArrayList<Question> listOfQuestions;
	Question [] arrayOfQuestions;
	private int correct;
	private int incorrect;

	int i;

	public Quiz() {


	}

	public void addQuestion(Question q) {
		i =0;
		listOfQuestions= new ArrayList();
		listOfQuestions.add(q);

		arrayOfQuestions = new Question [25];
		for (; i < arrayOfQuestions.length; i++) {
			arrayOfQuestions[i] = q;
			
		}
		
	}



	public double giveQuiz(Quiz q) {
		Quiz myQuiz = q;
		String thisQuestion;
		for (Question question : listOfQuestions) {
			thisQuestion = question.getQuestion();
			System.out.println(thisQuestion);
		}
		
		
		//System.out.println(listOfQuestions);
		return score;
	}
}