package edu.unca.csci201;

import java.util.Scanner;

public class TrueFalseQuestion implements Question {
	private String question;
	private String correctAnswer;
	private String givenAnswer;



	public TrueFalseQuestion(String question, String correctAnswer) {
		this.question = question;
		this.correctAnswer = correctAnswer;
		//this.givenAnswer = givenAnswer;
		//System.out.println("This is a true/false question. Please enter 'T' or 'F'");
		//System.out.println(question);
		//System.out.println("Correct answer is:" + correctAnswer);
		//Scanner scan = new Scanner(System.in);
		//String givenAnswer = scan.nextLine();
		//this.givenAnswer = givenAnswer;
		//System.out.println(givenAnswer);
		//scan.next();
		// TODO Auto-generated constructor stub
	}

	public String getQuestion() {
		return question;
	}

	public boolean isCorrectAnswer(String answer) {
		if (answer.equals(getCorrectAnswer())){
			System.out.println("correct!");
			return true;

		}
		System.out.println("incorrect!");
		return false;
	}

	public String getCorrectAnswer() {
		// TODO Auto-generated method stub
		return correctAnswer;
	}

	public String getGivenAnswer() {
		return givenAnswer;

	}
}
