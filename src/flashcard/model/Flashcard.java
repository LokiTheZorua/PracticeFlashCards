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
		buildCurrentQuestionNumber();
	}
	
	public void buildCurrentQuestionNumber()
	{
		int currentQuestion = (int) (Math.random() * questionList.size());
		
		questionNumber =  currentQuestion;
	}
	
	private void buildQuestionList()
	{
		questionList.add("what is 2 + 2? ");
		questionList.add("What color is the sun? ");
		questionList.add("How many fingers and thumbs do you have? ");
		questionList.add("What is the 26th letter in the alphabet? ");
	}
	
	private void buildAnswerList()
	{
		answerList.add("4");
		answerList.add("Yellow");
		answerList.add("10");
		answerList.add("z");
	}

	public String getCurrentQuestion()

	{
		String question;
		
		question = questionList.get(questionNumber);
		
		return question;
	}
	
	public int getQuestionListSize()
	{
		int questionSize = questionList.size();
		
		return questionSize;
	}
	

	public String getAnswer()
	{
		return answerList.get(questionNumber);
	}
}
