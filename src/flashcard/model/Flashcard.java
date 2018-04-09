package flashcard.model;

import java.util.*;

public class Flashcard
{
	private List<String> questionList;
	private List<String> answerList;
	int questionNumber;
	
	public Flashcard(String flashcardSet)
	{
		this.questionList = new ArrayList<String>();
		this.answerList = new ArrayList<String>();
		buildQuestionList();
		buildAnswerList();
		
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
	
	public String getCurrentQuestion()
	{
		int currentQuestion = (int) (Math.random() * questionList.size());
		
		questionNumber =  currentQuestion;
		
		String question;
		
		question = questionList.get(currentQuestion);
		
		return question;
	}
	
	public boolean checkCorrectAnswer(String answer)
	{
		if (answer == answerList.get(questionNumber))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double correctPercent(boolean correct)
	{
		int answersCorrect = 0;
		int questionsAnswered = 0;
		
		questionsAnswered++;
		
		if (correct = true)
			{
				answersCorrect++;
			}
		
		return answersCorrect / questionsAnswered;
	}
	
	public int getQuestionListSize()
	{
		int questionSize = questionList.size();
		
		return questionSize;
	}
}
