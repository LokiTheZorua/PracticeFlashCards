package flashcard.model;

import java.util.*;

public class Flashcard
{
	private List<String> questionList;
	private List<String> answerList;
	private int numberCorrrect;
	
	public Flashcards(String flashcardSet)
	{
		this.questionList = new ArrayList<String>();
		this.answerList = new ArrayList<String>();
		this.numberCorrrect = new int correctPercent();
	}
	
	public int correctPercent()
	{
		if (numberCorrect == 0)
		{
			if(questionList.indexOf(currentQuesiton) == answerList.indexOf(CurrentQuestion))
		}
		else
		{
			
			
		}
	}
	
	public int currentQuestion()
	{
		return (int) (Math.random() * questionList.size());
	}
}
