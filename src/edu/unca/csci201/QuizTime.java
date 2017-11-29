package edu.unca.csci201;

public class QuizTime {

		
	public static void main(String[] args) {
		Quiz q = new Quiz();
		
		TrueFalseQuestion one = new TrueFalseQuestion("is this right?","T");
		TrueFalseQuestion two = new TrueFalseQuestion("is this wrong?","F");
		
		q.addQuestion(one);
		q.addQuestion(two);
		
		q.giveQuiz(q);
		
		//System.out.println(q.arrayOfQuestions[1]);
		

		

			



		//one.getCorrectAnswer();
		//one.isCorrectAnswer("T");

	}

}
