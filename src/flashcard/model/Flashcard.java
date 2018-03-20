package flashcard.model;

import java.util.*;

public class Flashcard
{
	private List<String> questionList;
	private List<String> answerList;
	
	public Flashcard(String flashcardSet)
	{
		this.questionList = new ArrayList<String>();
		this.answerList = new ArrayList<String>();
		getCurrentQuestion();
		buildQuestionList();
		buildAnswerList();
		
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
	
	public boolean checkCorrectAnswer(String answer)
	{
		if (answer == answerList.get(getCurrentQuestion()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double correctPercent()
	{
		int answersCorrect = 0;
		int questionsAnswered = 0;
		
		
		answersCorrect++;
		
		return answersCorrect / questionsAnswered;
	}
}
