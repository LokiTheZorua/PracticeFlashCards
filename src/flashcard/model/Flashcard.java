package flashcard.model;

import java.util.*;

public class Flashcard
{
	private List<String> questionList;
	private List<String> answerList;
	private String answer;
	private int questionsAnswered = 0;
	private int correctAnswers = 0;
	
	public Flashcard(String flashcardSet)
	{
		this.questionList = new ArrayList<String>();
		this.answerList = new ArrayList<String>();
		
		getCurrentQuestion();
		buildQuestionList();
	}
	
	private int getCurrentQuestion()
	{
		int currentQuestion = (int) Math.random() * questionList.size();
		
		return currentQuestion;
	}
	
	private void buildQuestionList()
	{
		questionList.add("what is 2+ 2");
		questionList.add("What color is the sun?");
		questionList.add("How many fingers and thumbs do you have");
	}
	
	private void buildAnswerList()
	{
		answerList.add("2");
		answerList.add("Yellow");
		answerList.add("10");
	}
	
	
	public int correctPercent()
	{
		int correctPercent;
		
		boolean questionRight = false;
		
		int currentQuestion = getCurrentQuestion();
		
		if(answer == answerList.get(currentQuestion))
		{
			questionRight = true;
		}
		else
		{
			questionRight = false;
		}
		
		if(questionRight = true)
		{
			correctAnswers++;
			
			questionRight = false;
		}
		correctPercent = correctAnswers / questionsAnswered;
		
		return correctPercent;
	}
}
