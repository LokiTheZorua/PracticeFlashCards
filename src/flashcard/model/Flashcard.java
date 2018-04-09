package flashcard.model;

import java.util.*;

public class Flashcard
{
	private List<String> questionList;
	private List<String> answerList;
<<<<<<< HEAD
	private boolean correct;
=======
	int questionNumber;
>>>>>>> f917dff6cfe90b760bfe3dd847598d777fbc1646
	
	public Flashcard(String flashcardSet)
	{
		this.questionList = new ArrayList<String>();
		this.answerList = new ArrayList<String>();
		buildQuestionList();
		buildAnswerList();
		
	}
	
	private void buildQuestionList()
	{
		questionList.add("what is 2 + 2");
		questionList.add("What color is the sun?");
		questionList.add("How many fingers and thumbs do you have");
	}
	
	private void buildAnswerList()
	{
		answerList.add("4");
		answerList.add("Yellow");
		answerList.add("10");
	}
	
<<<<<<< HEAD
	public boolean checkCorrectAnswer(String answer)
	{
		if (answer == answerList.get(getCurrentQuestion()))
		{
			correct = true;
			return true;
		}
		else
		{
			correct = false;
			return false;
		}
	}
	
	public double correctPercent()
=======
	public String getCurrentQuestion()
>>>>>>> f917dff6cfe90b760bfe3dd847598d777fbc1646
	{
		int currentQuestion = (int) (Math.random() * questionList.size());
		
		questionNumber =  currentQuestion;
		
		String question;
		
		question = questionList.get(currentQuestion);
		
		return question;
	}
	
	public int getQuestionListSize()
	{
		int questionSize = questionList.size();
		
		return questionSize;
	}
	
<<<<<<< HEAD
=======
	public String getAnswer()
	{
		return answerList.get(questionNumber);
	}
	
>>>>>>> f917dff6cfe90b760bfe3dd847598d777fbc1646
	
}
