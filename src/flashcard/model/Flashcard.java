package flashcard.model;

import java.util.*;

public class Flashcard
{
	private List<String> questionList;
	private List<String> answerList;
	private int numberCorrrect;
	
	public Flashcard(String flashcardSet)
	{
		this.questionList = new ArrayList<String>();
		this.answerList = new ArrayList<String>();
		
		getCurrentQuestion();
	}
	
	private int getCurrentQuestion()
	{
		int currentQuestion = (int) Math.random() * questionList.size();
		
		return currentQuestion;
	}
	
	private void buildQuestionList()
	{
		
	}
	
	
	public int correctPercent()
	{
		int numberCorrect = 0;
		
		int currentQuestion = getCurrentQuestion();
		
		if (numberCorrect == 0)
		{
			if(questionList.indexOf(currentQuestion) == answerList.indexOf(currentQuestion))
			{
				if(questionRight = false)
				{
					
				}
				else
				{
					numberCorrect = 100;
				}
			}
		}
		else
		{
			
			
		}
	}
}
